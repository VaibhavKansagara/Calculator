package calculator;

import org.junit.*;

public class Tests {
    
    private Calculator calculator;
    
    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void test_Add() {
        int a = 35;
        int b = 20;
        int expected_value = 55;
        long result = calculator.add(a, b);
        Assert.assertEquals(expected_value, result);;
    }
    
    @Test
    public void test_Subtract() {
        int a = 50;
        int b = 20;
        int expected_value = 30;
        long result = calculator.subtract(a, b);
        Assert.assertEquals(expected_value, result);;
    }
    
    @Test
    public void test_Multiply() {
        int a = 3;
        int b = 7;
        long expected_value = 21;
        long result = calculator.multiply(a, b);
        Assert.assertEquals(expected_value, result);;
    }
    
    @Test
    public void test_Divide() {
        int a = 65;
        int b = 10;
        double expected_value = 6.5;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expected_value, result,0.00005);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_DivideByZero() {
        int a = 15;
        int b = 0;
        calculator.divide(a, b);
    }
}