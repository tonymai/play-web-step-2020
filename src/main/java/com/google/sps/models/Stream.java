package com.google.sps.servlets;
import java.util.ArrayList;

public class Stream {
    ArrayList<TopChartsCluster> stream = new ArrayList<TopChartsCluster>();
    ArrayList<StandardCluster> standardClusterStream = new ArrayList<StandardCluster>();
    
    Stream() {
        TopChartsCluster topCharts = new TopChartsCluster();
        stream.add(topCharts);
        StandardCluster standard = new StandardCluster();
        standardClusterStream.add(standard);
    }
}
