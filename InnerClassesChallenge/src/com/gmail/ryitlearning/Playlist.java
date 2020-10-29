package com.gmail.ryitlearning;//package com.gmail.ryitlearning;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class Playlist {
//    private String playListName;
//    private ArrayList<Album> albums;
//    private LinkedList<Song> playlist;
//
//    public Playlist(String playListName) {
//        this.playListName = playListName;
//        this.albums = new ArrayList<>();
//        this.playlist = new LinkedList<>();
//    }
//
//    public String getPlayListName() {
//        return playListName;
//    }
//
//    public void setPlayListName(String playListName) {
//        this.playListName = playListName;
//    }
//
//    public ArrayList<Album> getAlbums() {
//        return albums;
//    }
//
//    public void setAlbums(ArrayList<Album> albums) {
//        this.albums = albums;
//    }
//
//    public LinkedList<Song> getPlaylist() {
//        return playlist;
//    }
//
//    public void setPlaylist(LinkedList<Song> playlist) {
//        this.playlist = playlist;
//    }
//
//    public void addAlbum(String albumName){
//        Album album = new Album(albumName);
//    }
//
//    public void addToPlaylist(String albumName, String songTitle) {
//        Album albumToCheck = findAlbum(albumName);
//        Song songToAdd = albumToCheck.findSong(songTitle);
//        if (albumToCheck != null) {
//            if (songToAdd != null) {
//                this.playlist.addLast(songToAdd);
//                System.out.println("Song " + songTitle + " is added to " + this.playListName + " playlist");
//            } else {
//                System.out.println("Song not found");
//            }
//        } else {
//            System.out.println("album not found");
//        }
//    }
//
//    private Album findAlbum(String albumName){
//        for (int i = 0; i < this.albums.size(); i++) {
//            Album albumToCheck = this.albums.get(i);
//            if (albumToCheck.getAlbumName().equals(albumName)){
//                return albumToCheck;
//            }
//        }
//        System.out.println("Song not found");
//        return null;
//    }
//
//    @Override
//    public String toString() {
//        return "Playlist{" +
//                "playListName='" + playListName + '\'' +
//                ", albums=" + albums +
//                ", playlist=" + playlist +
//                '}';
//    }
//}
