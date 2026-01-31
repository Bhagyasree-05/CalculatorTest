package test.java;

import main.java.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        Assert.assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        Assert.assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.divide(6, 3));
    }
}