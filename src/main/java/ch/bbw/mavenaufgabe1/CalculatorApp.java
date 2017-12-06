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
    
    private boolean running;
    
    public CalculatorApp() {
        running = true;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
    
    public static void main(String[] args) {
        CalculatorApp cA = new CalculatorApp();
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        String text;
        double zahl1 = 0.0;
        double zahl2 = 0.0;
        System.out.println("Willkommen zu meinem Calculator. Um es auszuschalten, geben sie quit ein.");
        while (cA.isRunning()) {
            System.out.print("Bitte geben Sie die erste Zahl ein: ");
            text = sc.nextLine();
            if (!text.equals("quit")) {
                zahl1 = Double.parseDouble(text);
            } else {
                cA.setRunning(false);
            }
            System.out.print("Bitte geben Sie die zweite Zahl ein: ");
            text = sc.nextLine();
            if (!text.equals("quit")) {
                zahl1 = Double.parseDouble(text);
            } else {
                cA.setRunning(false);
            }
            double resultat = c.addition(zahl1, zahl2);
            System.out.println("Das Resultat ist " + resultat);
        }
    }
}
