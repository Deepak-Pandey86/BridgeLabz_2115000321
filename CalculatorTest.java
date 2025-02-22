org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class Calculator {
    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }


    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}


public class CalculatorTest {
    Calculator calculator = new Calculator();


    @Test
    void testAdd() {
        assertEquals(8, calculator.add(3, 5));
    }


    @Test
    void testSubtract() {
        assertEquals(4, calculator.subtract(9, 5));
    }


    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }


    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }


    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
