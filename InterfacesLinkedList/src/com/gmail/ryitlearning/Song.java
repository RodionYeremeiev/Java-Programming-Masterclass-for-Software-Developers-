package com.gmail.ryitlearning;

public class Song {
    private String title;
    private int duration; //song duration in seconds

    public Song(String title, int durartion) {
        this.title = title;
        this.duration = durartion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
