package com.timbuchalka;

public enum BodyTypes {
    STAR("Star", 0),
    PLANET("Planet", 1),
    DWARF_PLANET("Dwarf_Planet", 2),
    MOON("Moon", 3),
    COMET("Comet", 4),
    ASTEROID("Asteroid", 5);

    private String bodyTape;
    private int code;

    BodyTypes(String bodyType, int code) {
        this.bodyTape = bodyType;
        this.code = code;
    }

    public String getBodyTape() {
        return bodyTape;
    }

    public int getCode() {
        return code;
    }
}
