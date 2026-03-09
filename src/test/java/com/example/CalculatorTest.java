package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(6, calc.subtract(10, 4));
    }
}
