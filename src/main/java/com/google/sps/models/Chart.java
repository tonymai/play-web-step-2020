package com.google.sps.servlets;
import java.util.ArrayList;

class Chart {
    private String title;
    private ArrayList<App> apps;

    Chart(String title, ArrayList<App> apps) {
        this.title = title;
        this.apps = apps;
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<App> getApps() {
        return this.apps;
    }
}
