package com.timbuchalka;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
//    private final String name;
//    public BodyTypes bodyType;

    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
//        this.name = name;
//        this.bodyType = bodyType;

        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

//    public String getName() {
//        return name;
//    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

//    public BodyTypes getBodyType() {
//        return bodyType;
//    }


    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final int hashCode() {
//        return this.name.hashCode() + 57 + this.bodyType.hashCode();
        return this.key.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
//            if (this.name.equals(theObject.getName())) {
//                return this.bodyType == theObject.getBodyType();
//            }
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;

        private BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())) {
                return this.bodyType == key.getBodyType();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return "Key{" + "name='" + name + '\'' + ", bodyType=" + bodyType + '}';
        }
    }
}
