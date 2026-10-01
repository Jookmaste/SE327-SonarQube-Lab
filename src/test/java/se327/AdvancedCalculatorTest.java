package se327;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    private AdvancedCalculator advancedCalculator;

    @BeforeEach
    void setUp() {
        advancedCalculator = new AdvancedCalculator();
    }

    @Test
    void testSquareRoot() {
        assertEquals(4.0, advancedCalculator.squareRoot(16.0));
    }

    @Test
    void testSquareRootNegative() {
        assertThrows(IllegalArgumentException.class, () -> advancedCalculator.squareRoot(-4.0));
    }

    @Test
    void testPower() {
        assertEquals(8.0, advancedCalculator.power(2.0, 3.0));
    }

    @Test
    void testModulus() {
        assertEquals(1.0, advancedCalculator.modulus(5.0, 2.0));
    }

    @Test
    void testModulusByZero() {
        assertThrows(IllegalArgumentException.class, () -> advancedCalculator.modulus(5.0, 0));
    }
}