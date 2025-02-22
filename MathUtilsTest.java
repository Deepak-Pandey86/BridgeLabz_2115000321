

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MathUtils {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}


class MathUtilsTest {
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
    }


    @Test
    void testValidDivision() {
        assertEquals(5, MathUtils.divide(10, 2));
        assertEquals(-3, MathUtils.divide(9, -3));
    }
}
