package com.google.sps.servlets;
import java.util.ArrayList;

class Card {
    private String title;
    private String bigImageUrl;
    private App apps;

    Card(String title, String bigImageUrl, App apps) {
        this.title = title;
        this.bigImageUrl = bigImageUrl;
        this.apps = apps;
    }
}
