package com.hust.kstn.models;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    private int id ;
    private static int nbDigitalVideoDiscs = 0;
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public double getCost() {
        return cost;
    }
    public DigitalVideoDisc(String title){
        this.title = title;
    }
    public DigitalVideoDisc(String category, String title, double cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String director, String category, String title, double cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, double cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.length = length;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    @Override
    public String toString() {
    return "DVD [" + this.id + "]" + " - [" + this.title + "]" + " - [" + this.category + "]" + " - [" + this.director + "]" + " - [" + this.length + "]" + " - [" + this.cost + "]";
    }

}
