package com.regexjunit.junitquestions.testingcalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.substract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calc.mul(5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(5, calc.div(10, 2));
    }
}