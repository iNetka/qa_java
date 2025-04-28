package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        // Подготовка тестовых данных
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        // Настройка поведения мока
        when(feline.eatMeat()).thenReturn(expectedFood);

        // Создание тестируемого объекта
        Cat cat = new Cat(feline);

        // Вызов метода и проверка результата
        List<String> actualFood = cat.getFood();

        // Проверки
        assertEquals(expectedFood, actualFood);
        verify(feline, times(1)).eatMeat();
    }
}