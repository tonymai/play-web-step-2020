package com.google.sps.models;
import java.util.ArrayList;

public class Card {
    private String id;
    private String bigImageUrl;
    private App app;

    public Card(String id, String bigImageUrl, App app) {
        this.id = id;
        this.bigImageUrl = bigImageUrl;
        this.app = app;
    }

    public String getId() {
        return this.id;
    }

    public String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public App getApp() {
        return this.app;
    }
}
