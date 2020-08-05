package com.google.sps.seeder;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.sps.models.*;
import java.util.*;

public class ClusterSeeder {

    DatastoreService db = DatastoreServiceFactory.getDatastoreService();
    
    StandardCluster standardCluster = new StandardCluster();
    TopChartsCluster topChartsCluster = new TopChartsCluster();

    public void seedDB() {
        setTopChartsEntityProperties(makeTopChartsCluster());
        setStandardClusterProprties(makeStandardCluster());
    }

    private void setTopChartsEntityProperties(TopChartsCluster topChartsCluster) {
        Entity topChartsEntity = new Entity("Clusters");
        topChartsEntity.setProperty("id", topChartsCluster.getID());
        topChartsEntity.setProperty("title", topChartsCluster.getTitle());
        topChartsEntity.setProperty("type", topChartsCluster.getType());

        List<Map> topChartsMap = new ArrayList<Map>();
        List<Chart> charts = topChartsCluster.getCharts();

        for(int i = 0; i < charts.size(); i++) {
            Chart c = charts.get(i);

            Map tmpMap = new HashMap();
            tmpMap.put("id", c.getID());
            tmpMap.put("title", c.getTitle());

            List<App> chartApps = c.getApps();
            List<String> appIds = new ArrayList<String>();
            for(int j = 0; j < chartApps.size(); j++) {
                appIds.add(chartApps.get(j).getId());
            }
            tmpMap.put("apps", appIds);
            topChartsMap.add(tmpMap);
        }

        topChartsEntity.setProperty("charts", topChartsMap);

        db.put(topChartsEntity);
    }

    private void setStandardClusterProprties(StandardCluster standardCluster) {
        Entity standardEntity = new Entity("Clusters");
        standardEntity.setProperty("id", standardCluster.getID());
        standardEntity.setProperty("title", standardCluster.getTitle());
        standardEntity.setProperty("type", standardCluster.getType());

        List<Map> standardMap = new ArrayList<Map>();
        List<Card> cards = standardCluster.getCards();

        for(int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);

            Map tmpMap = new HashMap();
            tmpMap.put("id", c.getId());
            tmpMap.put("bigImageUrl", c.getBigImageUrl());

            App cardApp = c.getApp();

            tmpMap.put("appID", cardApp.getId());
            standardMap.add(tmpMap);
        }

        standardEntity.setProperty("cards", standardMap);

        db.put(standardEntity);
    }

    private TopChartsCluster makeTopChartsCluster() {

        TopChartsCluster topChartsCluster = new TopChartsCluster();

        App mockApp1 = new App.Builder("1").setTitle("mockApp1").setUrl("mockIcon1.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp2 = new App.Builder("2").setTitle("mockApp2").setUrl("mockIcon2.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp3 = new App.Builder("3").setTitle("mockApp3").setUrl("mockIcon3.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp4 = new App.Builder("4").setTitle("mockApp4").setUrl("mockIcon4.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp5 = new App.Builder("5").setTitle("mockApp5").setUrl("mockIcon5.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp6 = new App.Builder("6").setTitle("mockApp6").setUrl("mockIcon6.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();

        ArrayList<App> topFree = new ArrayList<App>();
        ArrayList<App> topGrossing = new ArrayList<App>();
        ArrayList<App> topPaid = new ArrayList<App>();

        Chart topFreeColumn = new Chart.Builder("1").setTitle("Top Free").setApps(topFree).build();
        Chart topGrossingColumn = new Chart.Builder("2").setTitle("Top Grossing").setApps(topGrossing).build();
        Chart topPaidColumn = new Chart.Builder("3").setTitle("Top Paid").setApps(topPaid).build();
    
        topChartsCluster.addChart(topFreeColumn);
        topChartsCluster.addChart(topGrossingColumn);
        topChartsCluster.addChart(topPaidColumn);
        topChartsCluster.setTitle("Top Charts");
        topChartsCluster.setSubtitle("For Wear OS");
        topFree.add(mockApp1);
        topFree.add(mockApp2);
        topGrossing.add(mockApp3);
        topGrossing.add(mockApp4);
        topPaid.add(mockApp5);
        topPaid.add(mockApp6);

        return topChartsCluster;
    }

    private StandardCluster makeStandardCluster() {

        StandardCluster standardCluster = new StandardCluster();

        App mockApp1 = new App.Builder("1").setTitle("mockApp1").setUrl("/images/emptyAppIcon.jpeg").setCategory("Fake Apps").setRating(5).setPrice(0).setRated("Everyone").setAppDescription("mock app description").build();
        App mockApp2 = new App.Builder("2").setTitle("mockApp2").setUrl("/images/emptyAppIcon.jpeg").setCategory("Fake Apps").setRating(5).setPrice(0).setRated("Everyone").setAppDescription("mock app description").build();
        App mockApp3 = new App.Builder("3").setTitle("mockApp3").setUrl("/images/emptyAppIcon.jpeg").setCategory("Fake Apps").setRating(5).setPrice(0.99).setRated("Everyone").setAppDescription("mock app description").build();
        App mockApp4 = new App.Builder("4").setTitle("mockApp4").setUrl("/images/emptyAppIcon.jpeg").setCategory("Fake Apps").setRating(5).setPrice(0).setRated("Everyone").setAppDescription("mock app description").build();
        Card mockCard1 = new Card("mockCard1", "/images/emptyAppIcon.jpeg", mockApp1);
        Card mockCard2 = new Card("mockCard2", "/images/emptyAppIcon.jpeg", mockApp2);
        Card mockCard3 = new Card("mockCard3", "/images/emptyAppIcon.jpeg", mockApp3);
        Card mockCard4 = new Card("mockCard4", "/images/emptyAppIcon.jpeg", mockApp4);
        standardCluster.addCard(mockCard1);
        standardCluster.addCard(mockCard2);
        standardCluster.addCard(mockCard3);
        standardCluster.addCard(mockCard4);
        standardCluster.setTitle("Rock out while you work out");

        return standardCluster;
    }
}
