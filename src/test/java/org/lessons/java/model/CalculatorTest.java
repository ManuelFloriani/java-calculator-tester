package org.lessons.java.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lessons.java.exception.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Correct addition of 2 numbers")
    void add() {
        float x = Calculator.add(9, 1);
        assertEquals(10, x);
        assertNotEquals(8, x);
    }

    @Test
    @DisplayName("Correct subtraction of 2 numbers")
    void subtract() {
        float x = Calculator.subtract(11,1);
        assertEquals(10,x);
        assertNotEquals(12,x);
    }

    @Test
    @DisplayName("Correct division of 2 numbers")
    void divide() {
        float x = Calculator.divide(20,2);
        assertEquals(10,x);
        assertNotEquals(18,x);
        assertThrows(DivideByZeroException.class, () -> Calculator.divide(20,0));
    }

    @Test
    @DisplayName("Correct multiplication of 2 numbers")
    void multiply() {
        float x = Calculator.multiply(5,2);
        assertEquals(10,x);
        assertNotEquals(18,x);
    }
}