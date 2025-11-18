package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media{
    private String artist;
    private String director;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String director, String artist, double cost) {
        super(title, category, cost);
        this.director = director;
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }
    public String getDirector(){
        return director;
    }

    public void addTrack(Track track){
        if (!tracks.contains(track)) tracks.add(track);
    }

    public void removeTrack(Track track){
        tracks.remove(track);
    }

    public int getLength(){
        int total = 0;
        for (Track t : tracks) total += t.getLength();
        return total;
    }

    public void play(){
        System.out.println("Playing CD: " + this.getTitle());
        for (Track t : tracks) t.play();
    }

    @Override
    public String toString(){
        return "CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - " + getLength() + ": " + getCost() + " $";
    }
}