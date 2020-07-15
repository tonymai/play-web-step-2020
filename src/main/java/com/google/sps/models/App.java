package com.google.sps.servlets;
import java.util.ArrayList;

public class App {
    public static class Builder {
        private String id;
        private String icon, name, category, rated, appDescription;
        private double rating, price;

        public Builder(String id) {
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setRating(double rating) {
            this.rating = rating;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setRated(String rated) {
            this.rated = rated;
            return this;
        }

        public Builder setAppDescription(String appDescription) {
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
}
