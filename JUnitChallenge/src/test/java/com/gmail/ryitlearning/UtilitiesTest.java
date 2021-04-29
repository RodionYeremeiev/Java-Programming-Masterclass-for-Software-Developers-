package com.gmail.ryitlearning;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {

    private Utilities utilities;

    @BeforeEach
    public void setUp() {
        utilities = new Utilities();
    }

    @org.junit.jupiter.api.Test
    public void everyNthChar() {
        String source = "hello";
        assertArrayEquals("el".toCharArray(), utilities.everyNthChar(source.toCharArray(), 2));
        assertArrayEquals(source.toCharArray(), utilities.everyNthChar(source.toCharArray(), 8));
    }

    @org.junit.jupiter.api.Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
        assertNull(utilities.removePairs(null), "Did not get null returned when argument passed was null");
    }


    @org.junit.jupiter.api.Test()
    public void converter() {
        assertEquals(300, utilities.converter(10, 5));
        assertThrows(ArithmeticException.class, () -> utilities.converter(10, 0));
    }

    @org.junit.jupiter.api.Test
    public void nullIfOddLength() {
        String oddLength = "ABCDEFG";
        String evenLength = "ABCDEF";
        assertEquals(evenLength, utilities.nullIfOddLength(evenLength));
        assertNull(utilities.nullIfOddLength(oddLength));
        assertNull(utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }
}