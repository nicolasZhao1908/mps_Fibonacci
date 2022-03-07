package org.zzlnico.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * fibonacci 0 -> 0
 * fibonacci 1 -> 1
 * fibonacci 2 -> 1
 * fibonacci 3 -> 2
 * fibonacci 4 -> 3
 * fibonacci 5 -> 5
 * fibonacci 6 -> 8
 * fibonacci negative number -> raises an exception
 */

class FibonacciTest {
    @Test
    public void shouldComputeReturnZeroIfTheNumberIsZero() {
        var fibonacci = new Fibonacci();
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne() {
        var fibonacci = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsTwo() {
        var fibonacci = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsThree() {
        var fibonacci = new Fibonacci();
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturn55IfTheNumberIsTen() {
        var fibonacci = new Fibonacci();
        int expectedValue = 55;
        int obtainedValue = fibonacci.compute(10);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeOfANegativeNumberRaiseAnException() {
        var fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }
}