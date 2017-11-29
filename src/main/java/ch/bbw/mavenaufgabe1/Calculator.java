/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.mavenaufgabe1;

/**
 *
 * @author 5im15edmunteanu
 */
public class Calculator {
    private double a;
    private double b;
    
    public Calculator() {
        
    }
    
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double addition(double a, double b) {
        return a + b;
    }
}
