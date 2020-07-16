package com.google.sps.servlets;
import java.util.ArrayList;

public class StandardCluster implements Cluster {
    private ArrayList<Card> cards = new ArrayList<Card>();

    StandardCluster() {
        makeCluster();
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public String getType() {
        return "Standard Cluster";
    }

    public void makeCluster() {
        App mockApp1 = new App.Builder("1").setName("mockApp1").setIcon("mokcIcon1.png").setCategory("Fake Apps").setRating(5).setPrice(0).setRated("Everyone").setAppDescription("mock app description").build();
        App mockApp2 = new App.Builder("2").setName("mockApp2").setIcon("mokcIcon2.png").setCategory("Fake Apps").setRating(5).setPrice(0).setRated("Everyone").setAppDescription("mock app description").build();
        App mockApp3 = new App.Builder("3").setName("mockApp3").setIcon("mokcIcon3.png").setCategory("Fake Apps").setRating(5).setPrice(0).setRated("Everyone").setAppDescription("mock app description").build();
        App mockApp4 = new App.Builder("4").setName("mockApp4").setIcon("mokcIcon4.png").setCategory("Fake Apps").setRating(5).setPrice(0).setRated("Everyone").setAppDescription("mock app description").build();
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
