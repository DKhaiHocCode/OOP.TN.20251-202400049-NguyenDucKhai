package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();

    private static int nbBooks = 0;

    public Book(String title, String category, double cost) {
        super(title, category, cost);
    }

    public void addAuthor(BookAuthor author){
        if (!authors.contains(author)){
            authors.add(author);
        }
    }

    public void removeAuthor(BookAuthor author) {
        if (authors.contains(author)) authors.remove(author);
    }

    @Override
    public String toString() {
        return "Book - " + getTitle() + " - " + getCategory() + " - " + getCost() + " $";
    }

    public Book(String title, String category, double cost, int numOfTokens) {
        super(title, category, cost);
        this.numOfTokens = numOfTokens;
    }
    public int getNumOfTokens() {
        return numOfTokens;
    }
}