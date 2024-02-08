/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.oauth2.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Collections;
import java.util.List;
import org.springframework.util.ClassUtils;

/**
 * Special ObjectInputStream subclass that checks if classes are allowed to deserialize.
 * The class should be configured with a whitelist of only allowed (safe) classes to deserialize.
 *
 * @author Artem Smotrakov
 */
public class SaferObjectInputStream extends ObjectInputStream {

    /**
     * The list of classes which are allowed for deserialization.
     */
    private final List<String> allowedClasses;

    /**
     * The class loader to use for loading local classes.
     */
    private final ClassLoader classLoader;

    /**
     * Create a new SaferObjectInputStream for the given InputStream, class loader and  allowed class names.
     *
     * @param in             the InputStream to read from
     * @param classLoader    the ClassLoader to use for loading local classes
     * @param allowedClasses the list of allowed classes for deserialization
     * @throws IOException
     */
    public SaferObjectInputStream(InputStream in, ClassLoader classLoader, List<String> allowedClasses)
        throws IOException {

        super(in);
        this.classLoader = classLoader;
        this.allowedClasses = Collections.unmodifiableList(allowedClasses);
    }

    /**
     * Create a new SaferObjectInputStream for the given InputStream and allowed class names.
     *
     * @param in             the InputStream to read from
     * @param allowedClasses the list of allowed classes for deserialization
     * @see ObjectInputStream#ObjectInputStream(InputStream)
     */
    public SaferObjectInputStream(InputStream in, List<String> allowedClasses) throws IOException {
        this(in, null, allowedClasses);
    }

    /**
     * Resolve the class only if it's allowed to deserialize.
     *
     * @see ObjectInputStream#resolveClass(ObjectStreamClass)
     */
    @Override
    protected Class<?> resolveClass(ObjectStreamClass classDesc) throws IOException, ClassNotFoundException {
        if (isProhibited(classDesc.getName())) {
            throw new NotSerializableException("Not allowed to deserialize " + classDesc.getName());
        }
        if (this.classLoader != null) {
            return ClassUtils.forName(classDesc.getName(), this.classLoader);
        }
        return super.resolveClass(classDesc);
    }

    /**
     * Check if the class is allowed to be deserialized.
     *
     * @param className the class to check
     * @return true if the class is not allowed to be deserialized, false otherwise
     */
    private boolean isProhibited(String className) {
        for (String allowedClass : this.allowedClasses) {
            if (className.startsWith(allowedClass)) {
                return false;
            }
        }
        return true;
    }
}
