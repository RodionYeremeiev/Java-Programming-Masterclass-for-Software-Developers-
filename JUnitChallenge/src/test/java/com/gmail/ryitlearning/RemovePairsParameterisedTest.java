package com.gmail.ryitlearning;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RemovePairsParameterisedTest {
    private Utilities utilities;

    private String source;
    private String expected;

    public RemovePairsParameterisedTest(String source, String expected) {
        this.source = source;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @Before
    public void setup() {
        utilities = new Utilities();
    }

    @Test
    public void removePairs() {
        Assert.assertEquals(expected, utilities.removePairs(source));
    }
}
