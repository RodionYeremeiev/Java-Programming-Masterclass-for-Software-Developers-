package com.gmail.ryitlearning;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    /**
     * 1. Album
     * <p>
     * - It has three fields, two Strings called name and artist,
     * and an ArrayList that holds objects of type Song called songs.
     * <p>
     * - A constructor that accepts two Strings (name of the album and artist).
     * It initialises the fields and instantiates songs.
     * <p>
     * - And three methods, they are:
     * <p>
     * - addSong(), has two parameters of type String (title of song), double (duration of song)
     * and returns a boolean. Returns true if the song was added successfully or false otherwise.
     * <p>
     * - findSong(), has one parameter of type String (title of song) and returns a Song.
     * Returns the Song if it exists, null if it doesn't exists.
     * <p>
     * - addToPlayList(), has two parameters of type int (track number of song in album)
     * and LinkedList (the playlist) that holds objects of type Song, and returns a boolean.
     * Returns true if it exists and it was added successfully using the track number, or false otherwise.
     * <p>
     * - addToPlayList(), has two parameters of type String (title of song)
     * and LinkedList (the playlist) that holds objects of type Song, and returns a boolean.
     * Returns true if it exists and it was added successfully using the name of the song, or false otherwise.
     */

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null){
            songs.add(new Song(title, duration));
            System.out.println("+");
            return true;
        } else {
            System.out.println("-");
            return false;
        }
    }

    private Song findSong(String title){
        Song song = null;
        for (int i = 0; i < songs.size(); i++) {
            song = songs.get(i);
            if (song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
            if (index >=0 && index <= songs.size()) {
                playlist.add(songs.get(index));
                return true;
            }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song song = findSong(title);
        if (song!=null){
            playlist.add(song);
            return true;
        }
        return false;
    }

}
