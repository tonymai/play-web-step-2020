package com.google.sps.servlets;
import java.util.ArrayList;

public class App {
    int id;
    String icon, name, category, rated, appDescription;
    double rating, price;

    App(int id, String name, String icon, String category, double rating, String rated, double price, String appDescription) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.rated = rated;
        this.price = price;
        this.appDescription = appDescription;
    }
}
