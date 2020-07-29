package com.google.sps.models;

public class AppOfTheWeek extends Cluster {
    private String title;

    public AppOfTheWeek() {
        this.type = getType();
        this.id = getID();
        this.title = "App of the week";
    }

    public String getType() {
        return "AppOfTheWeek";
    }

    public String getID() {
        return "appOfTheWeekID";
    }

    App mockApp1 = new App.Builder("1").setTitle("mockApp1").setIcon("mockIcon1.png").setCategory("Fake Apps").setRating(5).setPrice(0).setRated("Everyone").setAppDescription("mock app description").build();
}
