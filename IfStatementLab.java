/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatementlab;

import java.util.Scanner;

/**
 *
 * @author DASMARIÑAS_CPE113
 */
public class IfStatementLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("What problem would you like to tackle?");
        System.out.println("1. Age Categorization.");
        System.out.println("2. Temperature Evaluation.");
        System.out.println("3. Simple Grade Evaluation.");
        System.out.println("4. Circle Calculation.");
        System.out.println("5. Even or Odd number Evaluation.");
        int choice = input.nextInt();
        System.out.println();
        
        if (choice == 1) {
            System.out.println("Age Categorization.");
            System.out.println("What is your age?");
            int age = input.nextInt();
            System.out.println();
            if (age < 13) {
                System.out.println("You are a child.");
            } else if (age >= 13 && age <19) {
                System.out.println("You are a teenager.");
            } else if (age >= 20) {
                System.out.println("You are an adult.");
            } 
            System.out.println();
            
        } else if (choice == 2) {
            System.out.println("Temperature Evaluation.");
            System.out.println("What is today's temperature?");
            double temp = input.nextDouble();
            System.out.println();
            if (temp < 0) {
                System.out.println("Freezing point.");
            } else if (temp >= 0 && temp <= 25) {
                System.out.println("Normal weather.");
            } else if (temp > 25) {
                System.out.println("Hot weather.");
            }
            System.out.println();
            
        } else if (choice == 3) {
            System.out.println("Simple Grade Evaluation.");
            System.out.println("What is your test score out of 100?");
            int score = input.nextInt();
            System.out.println();
            if (score >= 90 && score <= 100) {
                System.out.println("Excellent");
            } else if (score >= 75 && score <= 89) {
                System.out.println("Good");
            } else if (score < 75 && score >= 0) {
                System.out.println("Needs Improvement");
            } else {
                System.out.println("Invalid score.");
            }
            System.out.println();
            
        } else if (choice == 4) {
            System.out.println("Circle Calculation.");
            System.out.println("What is the radius of the circle?");
            double r = input.nextDouble();
            System.out.println();
            if (r <= 0) {
                System.out.println("Invalid radius.");
            } else {
            System.out.println("The area of the circle is " + Math.PI*r*r + " square units.");
            System.out.println("The circumference of the circle is " + 2*Math.PI*r + " units.");
            }
            System.out.println();
        
        } else if (choice == 5) {
            System.out.println("Even or Odd Number Evaluation");
            System.out.println("Please enter an integer.");
            int num = input.nextInt();
            double rem = num % 2;
            System.out.println();
            if (rem == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
            
        } else {
            System.out.println("Invalid choice.");
        }
        
    input.close();
    }
    
}
