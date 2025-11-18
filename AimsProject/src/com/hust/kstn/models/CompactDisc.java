package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private int id;
    private String title;
    private String category;
    private double cost;
    private String artist;
    private String director;
    private List<Track> tracks = new ArrayList<>();

    private static int nbCompactDiscs = 0;

    public CompactDisc(String title, String category, String artist, String director, double cost){
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.director = director;
        this.cost = cost;
        nbCompactDiscs++;
        this.id = nbCompactDiscs;
    }

    public void addTrack(Track track){
        if (tracks.contains(track)) {
            System.out.println("Track already exists: " + track.getTitle());
        } else {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        }
    }

    public void removeTrack(Track track){
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track does not exist: " + track.getTitle());
        }
    }

    public int totalLength(){
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

    public void play(){
        System.out.println("Playing CD: " + this.title);
        System.out.println("CD length: " + this.totalLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString(){
        return "CD - " + title + " - " + category + " - " + director + " - " + artist + " - " + totalLength() + ": " + cost + " $";
    }
}