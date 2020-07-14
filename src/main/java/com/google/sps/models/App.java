package com.google.sps.servlets;
import java.util.ArrayList;

public class App {
    private int id;
    private String icon, name, category, rated, appDescription;
    private double rating, price;

    App(int id, String name, String icon, String category, double rating, double price) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.price = price;
    }

    App setRated(String rated) {
        this.rated = rated;
        return this;
    }

    App setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
}
