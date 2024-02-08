/*
 * #%L
 * ACS AEM Commons Bundle
 * %%
 * Copyright (C) 2018 Adobe
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.adobe.acs.commons.ondeploy.impl;

import com.adobe.acs.commons.ondeploy.OnDeployScript;
import com.day.cq.commons.jcr.JcrUtil;
import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.SearchResult;
import com.day.cq.wcm.api.PageManager;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Node;
import javax.jcr.PathNotFoundException;
import javax.jcr.Property;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.Workspace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Base on-deploy script implementation.
 */
public abstract class OnDeployScriptBase implements OnDeployScript {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected PageManager pageManager;
    protected QueryBuilder queryBuilder;
    protected ResourceResolver resourceResolver;
    protected Session session;
    protected Workspace workspace;

    /**
     * @see OnDeployScript#execute(ResourceResolver, QueryBuilder)
     */
    public final void execute(ResourceResolver resourceResolver, QueryBuilder queryBuilder) throws Exception {
        this.resourceResolver = resourceResolver;
        this.queryBuilder = queryBuilder;

        this.pageManager = resourceResolver.adaptTo(PageManager.class);
        this.session = resourceResolver.adaptTo(Session.class);
        this.workspace = session.getWorkspace();

        execute();

        session.save();
    }

    /**
     * Execute the script.
     *
     * This function must be implemented by all scripts.
     */
    protected abstract void execute() throws Exception;

    /**
     * Retrieve a node, or create it if not present.
     *
     * The node, as well as non-existent parent nodes, are created as type
     * nt:unstructured.
     *
     * @param absolutePath Path to fetch or create.
     * @return The fetched or created node.
     */
    protected Node getOrCreateNode(String absolutePath) throws RepositoryException {
        return getOrCreateNode(absolutePath, "nt:unstructured", "nt:unstructured");
    }

    /**
     * Retrieve a node, or create it if not present.
     *
     * If the node does not exist, it is created as the specified nodeType.
     *
     * Non-existent parent nodes are created as type nt:unstructured.
     *
     * @param absolutePath Path to fetch or create.
     * @param nodeType The type of node to create.
     * @return The fetched or created node.
     */
    protected Node getOrCreateNode(String absolutePath, String nodeType) throws RepositoryException {
        return getOrCreateNode(absolutePath, "nt:unstructured", nodeType);
    }

    /**
     * Retrieve a node, or create it if not present.
     *
     * If the node does not exist, it is created as the specified nodeType.
     *
     * Non-existent parent nodes are created as the type specified by
     * intermediateNodeType.
     *
     * @param absolutePath Path to fetch or create.
     * @param intermediateNodeType The type of intermediate nodes to create.
     * @param nodeType The type of node to create.
     * @return The fetched or created node.
     */
    protected Node getOrCreateNode(String absolutePath, String intermediateNodeType, String nodeType) throws RepositoryException {
        try {
            return session.getNode(absolutePath);
        } catch (PathNotFoundException e) {
            logger.info("Creating node (and missing parents): {}", absolutePath);
            return JcrUtil.createPath(absolutePath, intermediateNodeType, nodeType, session, false);
        }
    }

    /**
     * Rename a property on a node.
     *
     * @param node Node to update the property name on.
     * @param oldPropertyName Old property name.
     * @param newPropertyName New property name.
     */
    protected void renameProperty(Node node, String oldPropertyName, String newPropertyName) throws RepositoryException {
        Resource resource = resourceResolver.getResource(node.getPath());
        renameProperty(resource, oldPropertyName, newPropertyName);
    }

    /**
     * Rename a property on a resource.
     *
     * @param node Resource to update the property name on.
     * @param oldPropertyName Old property name.
     * @param newPropertyName New property name.
     */
    protected void renameProperty(Resource resource, String oldPropertyName, String newPropertyName) {
        ModifiableValueMap properties = resource.adaptTo(ModifiableValueMap.class);
        if (properties.containsKey(oldPropertyName)) {
            logger.info("Renaming property '{}' to '{}' on resource: {}", new Object[] { oldPropertyName, newPropertyName, resource.getPath() });
            properties.put(newPropertyName, properties.get(oldPropertyName));
            properties.remove(oldPropertyName);
        } else {
            logger.debug("Property '{}' does not exist on resource: {}", oldPropertyName, resource.getPath());
        }
    }

    /**
     * Remove node at a given path.
     *
     * @param path Path to the node to remove.
     */
    protected void removeResource(String path) throws RepositoryException {
        Resource resource = resourceResolver.getResource(path);
        if (resource != null) {
            logger.info("Deleting node at {}", path);
            session.removeItem(path);
        } else {
            logger.info("Node at {} has already been removed", path);
        }
    }

    /**
     * Searches for the current sling:resourceType under /content and replaces any nodes it finds
     * with the newResourceType.
     *
     * @param oldResourceType The current sling:resourceType.
     * @param newResourceType The new sling:resourceType to be used.
     */
    protected void searchAndUpdateResourceType(String oldResourceType, String newResourceType) throws RepositoryException {
        Map<String, String> map = new HashMap<>();
        map.put("p.limit", "-1");
        map.put("path", "/content");
        map.put("1_property", "sling:resourceType");
        map.put("1_property.value", oldResourceType);

        logger.info("Finding all nodes under /content with resource type: {}", oldResourceType);

        Query query = queryBuilder.createQuery(PredicateGroup.create(map), session);
        SearchResult result = query.getResult();
        Iterator<Node> nodeItr = result.getNodes();
        if (nodeItr.hasNext()) {
            while (nodeItr.hasNext()) {
                Node node = nodeItr.next();
                updateResourceType(node, newResourceType);
            }
        } else {
            logger.info("No nodes found");
        }
    }

    /**
     * Update the sling:resourceType of a node.
     *
     * @param node         The node to update.
     * @param resourceType The new sling:resourceType to be used.
     */
    protected void updateResourceType(Node node, String resourceType) throws RepositoryException {
        String currentResourceType = node.getProperty("sling:resourceType").getString();
        if (!resourceType.equals(currentResourceType)) {
            logger.info("Updating node at {} to resource type: {}", node.getPath(), resourceType);
            node.setProperty("sling:resourceType", resourceType);
        } else {
            logger.info("Node at {} is already resource type: {}", node.getPath(), resourceType);
        }
    }
}
