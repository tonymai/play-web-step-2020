package com.google.sps.seeder;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.sps.models.*;
import java.util.*;

public class ClusterSeeder {

    DatastoreService db = DatastoreServiceFactory.getDataStoreService();
    
    AppOfTheWeek appOfTheWeek = new AppOfTheWeek();
    StandardCluster standardCluster = new StandardCluster();
    TopChartsCluster topChartsCluster = new TopChartsCluster();

    public void seedDB() {
        setTopChartsEntityProperties(makeTopChartsCluster());
    }

    public void setTopChartsEntityProperties(TopChartsCluster topChartsCluster) {
        Entity topChartsEntity = new Entity("Cluster");
        topChartsEntity.setProperty("id", topChartsCluster.getID());
        topChartsEntity.setProperty("title", topChartsCluster.getTitle());
        topChartsEntity.setProperty("type", topChartsCluster.getType());

        List<Map> topChartsMap = new ArrayList<Map>();
        List<Map> charts = topChartsCluster.getCharts();

        for(int i = 0; i < charts.size(); i++) {
            Chart c = charts.get(i);

            Map tmpMap = new HashMap();
            tmpMap.set("id", c.getID());
            tmpMap.set("title", c.getTitle());

            List<Map> chartApps = c.get("apps");
            List<String> appIds = new ArrayList<String>();
            for(int j = 0; j < chartApps.size(); j++) {
                appIds.add(chartApps.get(j).get("id"));
            }
            tmpMap.set("apps", appIds);
            topChartsMap.add(tmpMap);
        }

        topChartsEntity.setProperty("charts", topChartsMap);

        db.put(topChartsEntity);
    }

    public TopChartsCluster makeTopChartsCluster() {

        TopChartsCluster topChartsCluster = new TopChartsCluster();

        App mockApp1 = new App.Builder("1").setTitle("mockApp1").setIcon("mockIcon1.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp2 = new App.Builder("2").setTitle("mockApp2").setIcon("mockIcon2.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp3 = new App.Builder("3").setTitle("mockApp3").setIcon("mockIcon3.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp4 = new App.Builder("4").setTitle("mockApp4").setIcon("mockIcon4.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp5 = new App.Builder("5").setTitle("mockApp5").setIcon("mockIcon5.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp6 = new App.Builder("6").setTitle("mockApp6").setIcon("mockIcon6.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();

        ArrayList<App> topFree = new ArrayList<App>();
        ArrayList<App> topGrossing = new ArrayList<App>();
        ArrayList<App> topPaid = new ArrayList<App>();

        Chart topFreeColumn = new Chart.Builder("1").setTitle("Top Free").setApps(topFree).build();
        Chart topGrossingColumn = new Chart.Builder("2").setTitle("Top Grossing").setApps(topGrossing).build();
        Chart topPaidColumn = new Chart.Builder("3").setTitle("Top Paid").setApps(topPaid).build();
    
        topChartsCluster.addChart(topFreeColumn);
        topChartsCluster.addChart(topGrossingColumn);
        topChartsCluster.addChart(topPaidColumn);

        topFree.add(mockApp1);
        topFree.add(mockApp2);

        topGrossing.add(mockApp3);
        topGrossing.add(mockApp4);

        topPaid.add(mockApp5);
        topPaid.add(mockApp6);

        return topChartsCluster;
    }
}