package com.gmail.ryitlearning;

public class BedRoom {
//    private TV theTV;
//    private Couch couch;
//    private RoomDimensions roomDimensions;
//
//    public BedRoom(TV theTV, Couch couch, RoomDimensions roomDimensions) {
//        this.theTV = theTV;
//        this.couch = couch;
//        this.roomDimensions = roomDimensions;
//    }
//
//    public TV getTheTV() {
//        return theTV;
//    }
//
//    public Couch getCouch() {
//        return couch;
//    }
//
//    public RoomDimensions getRoomDimensions() {
//        return roomDimensions;
//    }
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public BedRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making Bed");
        bed.make();
    }
}
