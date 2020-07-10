package com.google.sps.servlets;
import java.util.ArrayList;

public class Stream {
    ArrayList<TopChartsCluster> topChartStream = new ArrayList<TopChartsCluster>();
    ArrayList<StandardCluster> standardClusterStream = new ArrayList<StandardCluster>();
    
    Stream() {
        TopChartsCluster topCharts = new TopChartsCluster();
        topChartStream.add(topCharts);
        StandardCluster standard = new StandardCluster();
        StandardCluster.add(standard);
    }
}
