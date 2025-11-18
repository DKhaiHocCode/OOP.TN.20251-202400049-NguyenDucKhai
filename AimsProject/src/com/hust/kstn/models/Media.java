package com.hust.kstn.models;

public class Media {
    private int id;
    private String title;
    private String category;
    private double cost;

    public Media(String title, String category, double cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Media media = (Media) obj;
        return title != null && title.equals(media.title);
    }
    @Override
    public String toString() {
        return "Media - " + title + " - " + category + " - " + cost + " $";
    }
}
