package com.google.sps.servlets;
import java.util.ArrayList;

public class StandardCluster implements Cluster {
    ArrayList<Card> cards = new ArrayList<Card>();

    StandardCluster() {
        makeCluster();
    }

    public String getType() {
        return "Standard Cluster";
    }

    public void makeCluster() {
        App mockApp1 = new App(1, "mockApp1", "mockIcon1.png", "Fake Apps", 5, "Everyone", 0, "mock app description");
        App mockApp2 = new App(2, "mockApp2", "mockIcon2.png", "Fake Apps", 5, "Everyone", 0, "mock app description");
        App mockApp3 = new App(3, "mockApp3", "mockIcon3.png", "Fake Apps", 5, "Everyone", 0, "mock app description");
        App mockApp4 = new App(4, "mockApp4", "mockIcon4.png", "Fake Apps", 5, "Everyone", 0, "mock app description");
        Card mockCard1 = new Card("mockCard1", "https://mockBigImageUrl.com", mockApp1);
        Card mockCard2 = new Card("mockCard2", "https://mockBigImageUrl.com", mockApp2);
        Card mockCard3 = new Card("mockCard3", "https://mockBigImageUrl.com", mockApp3);
        Card mockCard4 = new Card("mockCard4", "https://mockBigImageUrl.com", mockApp4);
        cards.add(mockCard1);
        cards.add(mockCard2);
        cards.add(mockCard3);
        cards.add(mockCard4);
    }
}
