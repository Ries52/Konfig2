package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim BMI-Rechner!");



        System.out.print("Bitte geben Sie Ihren Vornamen ein: ");
        String firstname = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihren Nachnamen ein: ");
        String lastname = scanner.nextLine();

        System.out.print("Bitte geben Sie Ihre Körpergröße in cm ein: ");
        int bodyHeight = scanner.nextInt();

        System.out.print("Bitte geben Sie Ihr Gewicht in kg ein: ");
        double bodyWeight = scanner.nextDouble();

        System.out.print("Bitte geben Sie Ihr Geschlecht ein (m für männlich, w für weiblich): ");
        char gender = scanner.next().charAt(0);

        BMICalculator calculator = new BMICalculator(firstname, lastname, bodyHeight, bodyWeight, gender);

        double bmi = calculator.calculateBMI();
        String categoryName = calculator.getBMICategoryName();

        System.out.println("\nErgebnisse:");
        System.out.println("Name: " + calculator.getFirstname() + " " + calculator.getLastname());
        System.out.println("Körpergröße: " + calculator.getBodyHeight() + " cm");
        System.out.println("Gewicht: " + calculator.getBodyWeight() + " kg");
        System.out.println("Geschlecht: " + (calculator.getGender() == 'm' ? "Männlich" : "Weiblich"));
        System.out.println("Ihr BMI beträgt: " + bmi);
        System.out.println("Kategorie: " + categoryName);

        scanner.close();
    }
}
