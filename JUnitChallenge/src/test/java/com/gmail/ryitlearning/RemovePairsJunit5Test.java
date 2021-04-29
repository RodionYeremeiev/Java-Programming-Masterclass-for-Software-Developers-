package com.gmail.ryitlearning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RemovePairsJunit5Test {

    @ParameterizedTest
    @CsvSource({"ABCDEFF,      ABCDEF",
                "AB88EFFG,     AB8EFG",
                "112233445566, 123456",
                "ZYZQQB,       ZYZQB",
                "A,            A"})

    void removePairsTest(String source, String expected) {
        Utilities utilities = new Utilities();
        Assertions.assertEquals(expected, utilities.removePairs(source));
    }
}
