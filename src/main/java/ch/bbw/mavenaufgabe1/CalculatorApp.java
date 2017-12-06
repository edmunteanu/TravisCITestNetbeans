/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.mavenaufgabe1;

import java.util.Scanner;

/**
 *
 * @author 5im15edmunteanu
 */
public class CalculatorApp {
    
    public CalculatorApp() {
        
    }
    
    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen zu meinem Calculator. Um es auszuschalten, geben sie quit ein.");
        while (!sc.equals("quit")) {
            System.out.print("Bitte geben Sie die erste Zahl ein: ");
            double zahl1 = Double.parseDouble(sc.nextLine());
            System.out.print("Bitte geben Sie die zweite Zahl ein: ");
            double zahl2 = Double.parseDouble(sc.nextLine());
            double resultat = c.addition(zahl1, zahl2);
            System.out.println("Das Resultat ist " + resultat);
        }
    }
}
