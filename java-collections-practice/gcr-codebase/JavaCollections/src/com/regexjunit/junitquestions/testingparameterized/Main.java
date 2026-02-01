package com.regexjunit.junitquestions.testingparameterized;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Main {

    Logic l = new Logic();

    // EVEN numbers test
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 24, 10, 100})
    void testEvenNumbers(int n) {
        assertTrue(l.isEven(n));
    }

    // ODD numbers test
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 11, 33})
    void testOddNumbers(int n) {
        assertFalse(l.isEven(n));
    }
}
