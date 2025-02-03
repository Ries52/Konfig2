package org.example;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {

    @Test
    public void testConstructor() {
        BMICalculator calculator = new BMICalculator("John", "Doe", 170, 70, 'm');
        assertEquals("John", calculator.getFirstname());
        assertEquals("Doe", calculator.getLastname());
        assertEquals(170, calculator.getBodyHeight());
        assertEquals(70.0, calculator.getBodyWeight());
        assertEquals('m', calculator.getGender());
    }

    @Test
    public void testCalculateBMI() {
        BMICalculator calculator = new BMICalculator("John", "Doe", 170, 70, 'm');
        double bmi = calculator.calculateBMI();
        assertEquals(24.22, bmi, 0.01);
    }

    @Test
    public void testCalculateBMICategory() {
        BMICalculator calculator = new BMICalculator("John", "Doe", 170, 70, 'm');
        int category = calculator.calculateBMICategory();
        assertEquals(0, category); // Normalgewicht
    }

    @Test
    public void testGetBMICategoryName() {
        BMICalculator calculator = new BMICalculator("John", "Doe", 170, 70, 'm');
        String categoryName = calculator.getBMICategoryName();
        assertEquals("Normalgewicht", categoryName);
    }
}
