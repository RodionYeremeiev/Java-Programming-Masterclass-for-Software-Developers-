package com.gmail.ryitlearning;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    /**
     * The Playlist class will be modified to use an inner class called SongList
     * which will replace the ArrayList that was used to hold the list of songs for an album.
     * The SongList class will use an ArrayList to hold the track list for the album.
     * To do this a member variable called songs will need to be declared and a constructor
     * will need to be implemented to initialize the field.
     * <p>
     * In addition, the inner class will need three(3) methods:
     * <p>
     * 1) add - accepts a parameter of type Song.
     * This method returns a boolean value which will be false if the song is found to already be in the songs list.
     * If not, the song will be added to the list and a value of true will be returned.
     * <p>
     * 2) findSong - accepts the title of a song as its only parameter.
     * If the song with that title is found in the list then the song is returned from the method.
     * If not, a value of null is returned.
     * <p>
     * 3) findSong - overridden method which accepts a track number for a song. The track number is of type int.
     * If a song is found with that track number the song is returned, otherwise null is returned.
     * <p>
     * The member variable, constructor and all methods may be marked with private access.
     */

    private String name;
    private String artist;
    //    private ArrayList<Song> songs;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        private Song findSong(String title) {
            Song song = null;
            for (int i = 0; i < songs.size(); i++) {
                song = songs.get(i);
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index <= songs.size())) {
                return songs.get(index);
            }
            return null;
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                System.out.println("-");
                return false;
            }
            this.songs.add(song);
            System.out.println("+");
            return true;
        }
    }

    /**
     * For test compiler:
     * import java.util.ArrayList;
     * import java.util.LinkedList;
     *
     * public class Album {
     * private String name;
     *     private String artist;
     *     private SongList songs;
     *
     *     public Album(String name, String artist) {
     *         this.name = name;
     *         this.artist = artist;
     *         this.songs = new SongList();
     *     }
     *
     *     public boolean addSong(String title, double duration) {
     *         return this.songs.add(new Song(title, duration));
     *     }
     *
     *     public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
     *         Song checkedSong = this.songs.findSong(trackNumber);
     *         if (checkedSong != null) {
     *             playlist.add(checkedSong);
     *             return true;
     *         }
     *         System.out.println("This album does not have a track " + trackNumber);
     *         return false;
     *     }
     *
     *     public boolean addToPlayList(String title, LinkedList<Song> playlist) {
     *         Song checkedSong = this.songs.findSong(title);
     *         if (checkedSong != null) {
     *             playlist.add(checkedSong);
     *             return true;
     *         }
     *         System.out.println("The song " + title + " is not in this album");
     *         return false;
     *     }
     *
     *
     *     public static class SongList {
     *         private ArrayList<Song> songs;
     *
     *         private SongList() {
     *             this.songs = new ArrayList<Song>();
     *         }
     *
     *         private Song findSong(String title) {
     *             Song song = null;
     *             for (int i = 0; i < songs.size(); i++) {
     *                 song = songs.get(i);
     *                 if (song.getTitle().equals(title)) {
     *                     return song;
     *                 }
     *             }
     *             return null;
     *         }
     *
     *         private Song findSong(int trackNumber) {
     *             int index = trackNumber - 1;
     *             if ((index >= 0) && (index <= songs.size())) {
     *                 return songs.get(index);
     *             }
     *             return null;
     *         }
     *
     *         private boolean add(Song song) {
     *             if (songs.contains(song)) {
     *                 System.out.println("-");
     *                 return false;
     *             }
     *             this.songs.add(song);
     *             System.out.println("+");
     *             return true;
     *         }
     *     }
     * }
     */

}

