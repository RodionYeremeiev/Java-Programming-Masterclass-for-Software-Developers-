package com.gmail.ryitlearning;


import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<Album>();
    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list
    // in the order they are added.

    // Once the songs have been added to the playlist, create a menu of options to:
    // - Quit;
    // - Skip forward to the next song;
    // - skip backwards to a previous song;
    // - Replay the current song;
    // - List the songs in the playlist.

    // A song must exist in an album before it can be added to the playlist
    // (so you can only play songs that you own).
    // Hint:  To replay a song, consider what happened when we went back and forth
    // from a city before we started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listIterator.remove()

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - Skip forward to the next song;\n" +
                "2 - Skip backwards to a previous song;\n" +
                "3 - Replay the current song;\n" +
                "4 - List the songs in the playlist;\n" +
                "5 - print available options.\n" +
                "6 - delete current song from playlist");
    }

    private static void play(List<Song> playlist) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("Playlist is empty");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("End of Playlist");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of Playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Start of playlist");
                        printMenu();
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Start of Playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of Playlist");
                        }
                    }
                    break;

                case 4:
                    printList(playlist);
//                    System.out.println(playlist.toString());
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("***********************");
        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
            System.out.println(iterator.next());
        }
        System.out.println("***********************");
    }

    public static void main(String[] args) {
        // write your code here
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 274);
        album.addSong("Love don't mean a thing", 247);
        album.addSong("Holy man", 260);
        album.addSong("Hold on", 340);
        album.addSong("Lady double dealer", 200);
        album.addSong("You can't do it right", 330);
        album.addSong("Highball shooter", 240);
        album.addSong("The Gypsy", 260);
        album.addSong("Soldier of fortune", 190);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 360);
        album.addSong("I put the finger on you", 195);
        album.addSong("Let's go", 225);
        album.addSong("Inject the venom", 210);
        album.addSong("Snowballed", 291);
        album.addSong("Evil walks", 232);
        album.addSong("C.O.D", 303);
        album.addSong("Breaking the rules", 325);
        album.addSong("Night of the long knivess", 301);
        albums.add(album);

        List<Song> playlist = new ArrayList<>();
        albums.get(0).addToPlaylist("You can't do it right", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Speed king", playlist);//does not exist
        albums.get(0).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(8, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(24, playlist); //there is no track 24

        play(playlist);


    }
}