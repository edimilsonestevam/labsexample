package pt.av.edimilsonestevam.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    private final ScientificCalculator calculator = new ScientificCalculator();

    @Test
    void shouldAddCorrectly() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(RuntimeException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void shouldCalculatePower() {
        assertEquals(8, calculator.power(2, 3));
    }

    @Test
    void shouldCalculateSquareRoot() {
        assertEquals(4, calculator.sqrt(16));
    }
}