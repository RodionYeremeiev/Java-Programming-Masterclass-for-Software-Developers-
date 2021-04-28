package com.gmail.ryitlearning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class UtilitiesTest {

    @org.junit.jupiter.api.Test
    public void everyNthChar() {
        fail("Yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    public void removePairs() {
        Utilities utilities = new Utilities();
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));

    }

    @org.junit.jupiter.api.Test
    public void converter() {
        fail("Yet to be implemented");
    }

    @org.junit.jupiter.api.Test
    public void nullIfOddLength() {
        fail("Yet to be implemented");
    }
}