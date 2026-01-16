package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2.0, calculator.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15.0, calculator.multiply(3, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
    }
}
