package org.example;

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
            default -> "Something goes wrong";
        };
    }

    // Helper method to round to 2 decimal places
    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
