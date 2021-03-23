package com.gmail.ryitlearning;

import com.gmail.ryitlearning.model.Artist;
import com.gmail.ryitlearning.model.DataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.open()){
            System.out.println("Can't open database");
            return;
        }

//        List<Artist> artists = dataSource.queryArtist(DataSource.ORDER_BY_NONE);
//        List<Artist> artists = dataSource.queryArtist(DataSource.ORDER_BY_ASC);
        List<Artist> artists = dataSource.queryArtist(DataSource.ORDER_BY_DESC);

        if (artists == null){
            System.out.println("No Artists!");
            return;
        }

        for (Artist artist:artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        dataSource.close();
    }
}
