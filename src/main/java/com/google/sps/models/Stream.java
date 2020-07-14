package com.google.sps.servlets;
import java.util.ArrayList;
import java.util.List;

public class Stream {
    List<Cluster> clusters = new ArrayList<Cluster>();

    Stream() {
        TopChartsCluster topCharts = new TopChartsCluster();
        clusters.add(topCharts);
        StandardCluster standard = new StandardCluster();
        clusters.add(standard);
    }
}
