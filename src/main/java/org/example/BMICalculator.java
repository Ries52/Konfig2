package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

// BMICalculator.java
    public class BMICalculator {
        private String firstname;
        private String lastname;
        private int bodyHeight; // in cm
        private double bodyWeight; // in kg
        private char gender; // 'm' for male, 'w' for female

        // Constructor
        public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.bodyHeight = bodyHeight;
            this.bodyWeight = bodyWeight;
            this.gender = gender;
        }

        // Getters
        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public int getBodyHeight() {
            return bodyHeight;
        }

        public double getBodyWeight() {
            return bodyWeight;
        }

        public char getGender() {
            return gender;
        }

        // Setters
        public void setBodyHeight(int bodyHeight) {
            this.bodyHeight = bodyHeight;
        }

        public void setBodyWeight(double bodyWeight) {
            this.bodyWeight = bodyWeight;
        }

        // Calculate BMI
        public double calculateBMI() {
            double heightInMeters = bodyHeight / 100.0;
            double bmi = bodyWeight / (heightInMeters * heightInMeters);
            return round(bmi);
        }

        // Calculate BMI category
        public int calculateBMICategory() {
            double bmi = calculateBMI();
            if (gender == 'm') {
                if (bmi < 16.0) return -2;
                if (bmi < 18.5) return -1;
                if (bmi < 25.0) return 0;
                if (bmi < 35.0) return 1;
                return 2;
            } else if (gender == 'w') {
                if (bmi < 15.0) return -2;
                if (bmi < 17.5) return -1;
                if (bmi < 24.0) return 0;
                if (bmi < 34.0) return 1;
                return 2;
            }
            return -1; // Default case
        }

        // Get BMI category name
        public String getBMICategoryName() {
            int category = calculateBMICategory();
            return switch (category) {
                case -2 -> "Sehr starkes Untergewicht";
                case -1 -> "Untergewicht";
                case 0 -> "Normalgewicht";
                case 1 -> "Übergewicht";
                case 2 -> "Sehr starkes Übergewicht";
                default -> "Unbekannt";
            };
        }

        // Helper method to round to 2 decimal places
        private double round(double value) {
            return Math.round(value * 100.0) / 100.0;
        }
        // Main method with Scanner
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