package com.google.sps.servlets;
import java.util.ArrayList;

public class App {
    private String id;
    private String icon, name, category, rated, appDescription;
    private double rating, price;

    public App setId(String id) {
        this.id = id;
        return this;
    }

    public App setName(String name) {
        this.name = name;
        return this;
    }

    public App setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public App setCategory(String category) {
        this.category = category;
        return this;
    }

    public App setRating(double rating) {
        this.rating = rating;
        return this;
    }

    public App setPrice(double price) {
        this.price = price;
        return this;
    }

    public App setRated(String rated) {
        this.rated = rated;
        return this;
    }

    public App setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }

    public App build() {
        App app = new App();
        app.id = this.id;
        app.name = this.name;
        app.icon = this.icon;
        app.category = this.category;
        app.rating = this.rating;
        app.price = this.price;
        app.rated = this.rated;
        app.appDescription = this.appDescription;
        return app;
    }
}
