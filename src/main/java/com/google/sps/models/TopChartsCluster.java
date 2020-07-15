package com.google.sps.servlets;
import java.util.ArrayList;

public class TopChartsCluster implements Cluster {
    String title = "Top Charts";
    ArrayList<Chart> charts = new ArrayList<Chart>();

    TopChartsCluster() {
        makeCluster();
    }

    public String getType() {
        return "Top Charts";
    }

    public void makeCluster(){
        App mockApp1 = new App().setId("1").setName("mockApp1").setIcon("mockIcon1.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp2 = new App().setId("2").setName("mockApp2").setIcon("mockIcon2.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp3 = new App().setId("3").setName("mockApp3").setIcon("mockIcon3.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp4 = new App().setId("4").setName("mockApp4").setIcon("mockIcon4.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp5 = new App().setId("5").setName("mockApp5").setIcon("mockIcon5.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();
        App mockApp6 = new App().setId("6").setName("mockApp6").setIcon("mockIcon6.png").setCategory("Fake Apps").setRating(5).setPrice(0).build();

        ArrayList<App> topFree = new ArrayList<App>();
        ArrayList<App> topGrossing = new ArrayList<App>();
        ArrayList<App> topPaid = new ArrayList<App>();

        Chart topFreeColumn = new Chart("Top Free", topFree);
        Chart topGrossingColumn = new Chart("Top Grossing", topGrossing);
        Chart topPaidColumn = new Chart("Top Paid", topPaid);
        topFree.add(mockApp1);
        topFree.add(mockApp2);

        topGrossing.add(mockApp3);
        topGrossing.add(mockApp4);

        topPaid.add(mockApp5);
        topPaid.add(mockApp6);

        charts.add(topFreeColumn);
        charts.add(topGrossingColumn);
        charts.add(topPaidColumn);
    }
}
