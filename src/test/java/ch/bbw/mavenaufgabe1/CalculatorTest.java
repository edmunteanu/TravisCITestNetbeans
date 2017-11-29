/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.mavenaufgabe1;

import static org.junit.Assert.*;

/**
 *
 * @author 5im15edmunteanu
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    @org.junit.Test
    public void testSummeZweiPositive() {
        double a = 5.0;
        double b = 5.0;

        Calculator instance = new Calculator();

        double result = instance.addition(a, b);
        double expResult = 10.0;

        assertEquals(expResult, result, 0.0);
    }

}
