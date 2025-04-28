package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {
    private final int expectedKittens;
    private final Feline feline = new Feline();

    public FelineTest(int expectedKittens) {
        this.expectedKittens = expectedKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {1},
                {3},
                {5}
        };
    }

    @Test
    public void testGetKittensWithCount() {
        assertEquals(expectedKittens, feline.getKittens(expectedKittens));
    }

    @Test
    public void testGetKittensDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }
}