package com.hust.kstn.models;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost){
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    @Override
    public String toString(){
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }

}
