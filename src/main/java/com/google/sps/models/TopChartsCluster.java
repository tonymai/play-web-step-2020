package com.google.sps.models;

import java.util.ArrayList;
import java.util.List;

public class TopChartsCluster extends Cluster {
    private String title;
    private String subtitle;
    private List<Chart> charts = new ArrayList<Chart>();

    public TopChartsCluster() {
        this.type = getType();
        this.id = getID();
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public List<Chart> getCharts() {
        return this.charts;
    }

    public String getType() {
        return "TopCharts";
    }

    public String getID() {
        return "topChartsID";
    }

    public void addChart(Chart chart) {
        this.charts.add(chart);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
