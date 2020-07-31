package com.google.sps.models;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class StandardCluster extends Cluster {
    public String title;
    public List<Card> cards = new ArrayList<Card>();

    public StandardCluster() {
        this.title = "Rock out while you work out";
        this.type = getType();
        this.id = getID();
    }

    public String getTitle() {
        return this.title;
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public String getType() {
        return "StandardCluster";
    }

    public String getID() {
        return "standardClusterID";
    }
}
