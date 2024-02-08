package com.graphhopper.routing.util.spatialrules;

import com.graphhopper.util.shapes.GHPoint;
import com.vividsolutions.jts.geom.*;
import com.vividsolutions.jts.geom.impl.CoordinateArraySequence;
import com.vividsolutions.jts.index.quadtree.Quadtree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class QuadtreeSpatialRuleLookup implements SpatialRuleLookup {

    private Quadtree quadTree = new Quadtree();
    private GeometryFactory geometryFactory = new GeometryFactory();
    private Map<String, Integer> ids = new HashMap<>();

    @Override
    public SpatialRule lookupRule(double lat, double lon) {
        Point point = geometryFactory.createPoint(new Coordinate(lon, lat));
        List rules = quadTree.query(point.getEnvelopeInternal());
        for (Object geometry : rules) {
            if (((Geometry) geometry).contains(point)) {
                return (SpatialRule) ((Geometry) geometry).getUserData();
            }
        }
        return SpatialRule.EMPTY;
    }

    @Override
    public SpatialRule lookupRule(GHPoint point) {
        return lookupRule(point.getLat(), point.getLon());
    }

    @Override
    public void addRule(SpatialRule rule) {
        List<com.vividsolutions.jts.geom.Polygon> polygons = new ArrayList<>();
        for (Polygon polygon : rule.getBorders()) {
            Coordinate[] coordinates = new Coordinate[polygon.lat.length+1];
            for (int i = 0; i<polygon.lat.length; ++i) {
                coordinates[i] = new Coordinate(polygon.lon[i], polygon.lat[i]);
            }
            coordinates[coordinates.length-1] = coordinates[0];
            polygons.add(geometryFactory.createPolygon(new CoordinateArraySequence(coordinates)));
        }
        MultiPolygon shape = geometryFactory.createMultiPolygon(polygons.toArray(new com.vividsolutions.jts.geom.Polygon[polygons.size()]));
        shape.setUserData(rule);

        ids.put(rule.getId(), quadTree.size());
        quadTree.insert(shape.getEnvelopeInternal(), shape);
    }

    @Override
    public int getSpatialId(SpatialRule rule) {
        return rule == SpatialRule.EMPTY ? 0 : ids.get(rule.getId()) + 1;
    }

    @Override
    public int size() {
        return quadTree.size();
    }
}
