package com.google.sps.models;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class StandardCluster extends Cluster {
    private String title;
    private List<Card> cards = new ArrayList<Card>();

    public StandardCluster() {
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

    public void addCard (Card c) {
        this.cards.add(c);
    }

    public void setTitle (String title){
        this.title = title;
    }
}
