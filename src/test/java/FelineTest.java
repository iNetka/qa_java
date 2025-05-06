package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void shouldReturnOneKittenByDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void shouldReturnCorrectFamilyName() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void shouldReturnPredatorFoodListWhenEatMeatIsCalled() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }
}
