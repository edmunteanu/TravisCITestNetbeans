package ch.bbw.mavenaufgabe1;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author 5im15edmunteanu
 */
public class CalculatorTest {

    /**
     * Test of addition method, of class Calculator.
     */
    @org.junit.Test
    public void testAddition() {
        System.out.println("addition");
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.addition(a, b);
        assertEquals(expResult, result, 0.0);
    }

}
