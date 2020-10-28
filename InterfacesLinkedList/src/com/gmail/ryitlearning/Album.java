package com.gmail.ryitlearning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songsInAlbum;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songsInAlbum = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<Song> getSongsInAlbum() {
        return songsInAlbum;
    }

    public void addSong(String title, int duration) {
        if (findSong(title) == null) {
            this.songsInAlbum.add(new Song(title, duration));
//            System.out.println("Song " + title + " added to album");
        } else {
//            System.out.println("Song already in album");
        }
    }

    public void removeSongFromAlbum(String title) {
        Song songToAdd = findSong(title);
        if (songToAdd != null) {
            this.songsInAlbum.remove(songToAdd);
//            System.out.println("Song " + title + " removed from album");
        } else {
//            System.out.println("Song not found");
        }
    }

    public Song findSong(String title) {
        for (Song checkedSong : this.songsInAlbum) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
//        System.out.println("Song not found");
        return null;
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songsInAlbum.size())) {
            playlist.add(this.songsInAlbum.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playlist) {
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    }
