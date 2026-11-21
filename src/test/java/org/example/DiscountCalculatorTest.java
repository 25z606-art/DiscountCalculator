
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {

    DiscountCalculator obj = new DiscountCalculator();

    @Test
    public void test1000() {
        assertEquals(100, obj.calculateDiscount(1000), 0.01);
    }

    @Test
    public void test2000() {
        assertEquals(200, obj.calculateDiscount(2000), 0.01);
    }

    @Test
    public void test500() {
        assertEquals(0, obj.calculateDiscount(500), 0.01);
    }

    @Test
    public void test999() {
        assertEquals(0, obj.calculateDiscount(999), 0.01);
    }

    @Test
    public void testFinalAmount() {
        assertEquals(900, obj.calculateFinalAmount(1000), 0.01);
    }
}
