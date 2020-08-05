package com.google.sps.service;

import java.util.ArrayList;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

public class ClusterReader {
    private DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

    public ArrayList<Entity> getClusters() {
        List<Entity> clusters = new ArrayList<Entity>();

        Query query = new Query("Cluster");
        PreparedQuery results = datastore.prepare(query);

        for (Entity entity : results.asIterable()) {
            clusters.add(entity);
        }
        
        return clusters;
    }
}
