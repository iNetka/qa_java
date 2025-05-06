package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int expectedKittens;
    private final Feline feline = new Feline();

    public FelineParameterizedTest(int expectedKittens) {
        this.expectedKittens = expectedKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                {1},
                {3},
                {5}
        };
    }

    @Test
    public void shouldReturnCorrectKittensCountWhenCalledWithParameter() {
        assertEquals(expectedKittens, feline.getKittens(expectedKittens));
    }
}
