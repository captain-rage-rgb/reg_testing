
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Main m = new Main();

    @Test
    public void testAdd() {
        assertEquals(15, m.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, m.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, m.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, m.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> m.divide(10, 0));
    }
}
