/*
 * SonarQube XML Plugin
 * Copyright (C) 2010-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.xml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sonar.api.batch.Event;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.InputPath;
import org.sonar.api.design.Dependency;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.MeasuresFilter;
import org.sonar.api.measures.Metric;
import org.sonar.api.resources.ProjectLink;
import org.sonar.api.resources.Resource;
import org.sonar.api.rules.Violation;

/**
 * @author Matthijs Galesloot
 */
public class MockSensorContext implements SensorContext {

  private Measure measure;
  private final Map<Resource, List<Measure>> measures = new HashMap<Resource, List<Measure>>();
  private final List<Resource> resources = new ArrayList<Resource>();

  private final List<Violation> violations = new ArrayList<Violation>();

  public Event createEvent(Resource resource, String name, String description, String category, Date date) {
    // TODO Auto-generated method stub
    return null;
  }

  public void deleteEvent(Event event) {
    // TODO Auto-generated method stub
  }

  @Override
  public Measure saveMeasure(InputFile inputFile, Metric metric, Double value) {
    return null;
  }

  @Override
  public Measure saveMeasure(InputFile inputFile, Measure measure) {
    return null;
  }

  @Override
  public Resource getResource(InputPath inputPath) {
    return null;
  }

  public void deleteLink(String key) {
    // TODO Auto-generated method stub
  }

  public Set<Dependency> getDependencies() {
    // TODO Auto-generated method stub
    return null;
  }

  public List<Event> getEvents(Resource resource) {
    // TODO Auto-generated method stub
    return null;
  }

  public Collection<Dependency> getIncomingDependencies(Resource to) {
    // TODO Auto-generated method stub
    return null;
  }

  public Measure getMeasure(Metric metric) {
    return measure;
  }

  public Measure getMeasure(Resource resource, Metric metric) {
    for (Resource r : measures.keySet()) {
      if (r.equals(resource)) {
        for (Measure m : measures.get(r)) {
          if (m.getMetric().equals(metric)) {
            return m;
          }
        }
      }
    }
    return null;
  }

  public <M> M getMeasures(MeasuresFilter<M> filter) {
    // TODO Auto-generated method stub
    return null;
  }

  public <M> M getMeasures(Resource resource, MeasuresFilter<M> filter) {
    // TODO Auto-generated method stub
    return null;
  }

  public int getNumResources() {
    return resources.size();
  }

  public Collection<Dependency> getOutgoingDependencies(Resource from) {
    // TODO Auto-generated method stub
    return null;
  }

  public Resource getResource(Resource resource) {
    // TODO Auto-generated method stub
    return null;
  }

  public List<Resource> getResources() {
    return resources;
  }

  public List getViolations() {
    return violations;
  }

  public Dependency saveDependency(Dependency dependency) {
    // TODO Auto-generated method stub
    return null;
  }

  public void saveLink(ProjectLink link) {
    // TODO Auto-generated method stub

  }

  public Measure saveMeasure(Measure measure) {
    // TODO Auto-generated method stub
    return null;
  }

  public Measure saveMeasure(Metric metric, Double value) {
    this.measure = new Measure(metric, value);
    return measure;
  }

  public Measure saveMeasure(Resource resource, Measure measure) {
    if (measures.get(resource) == null) {
      measures.put(resource, new ArrayList<Measure>());
    }
    if ( !resources.contains(resource)) {
      resources.add(resource);
    }
    measures.get(resource).add(measure);
    return measure;
  }

  public Measure saveMeasure(Resource resource, Metric metric, Double value) {
    Measure m = new Measure(metric, value);
    return saveMeasure(resource, m);
  }

  public String saveResource(Resource resource) {
    resources.add(resource);
    return null;
  }

  public void saveSource(Resource resource, String source) {
    resources.add(resource);
  }

  public void saveViolation(Violation violation) {
    violations.add(violation);
  }

  public void saveViolation(Violation arg0, boolean arg1) {
    // TODO Auto-generated method stub

  }

  public void saveViolations(Collection<Violation> violations) {
    // TODO Auto-generated method stub

  }

  public boolean index(Resource resource) {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean index(Resource resource, Resource parentReference) {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean isExcluded(Resource reference) {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean isIndexed(Resource reference, boolean acceptExcluded) {
    // TODO Auto-generated method stub
    return false;
  }

  public Resource getParent(Resource reference) {
    // TODO Auto-generated method stub
    return null;
  }

  public Collection<Resource> getChildren(Resource reference) {
    // TODO Auto-generated method stub
    return null;
  }
}
