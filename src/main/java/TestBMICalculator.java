//import com.google.common.annotations.VisibleForTesting;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//public class TestBMICalculator {
//
//
//
//        @Test
//        @DisplayName("Constructor test")
//        void BMICalculator() {
//            BMICalculator calculator = new BMICalculator("Peter", "Fischer", 183, 75, 'M');
//
//            Assertions.assertEquals("Peter", calculator.getFirstName());
//            Assertions.assertEquals("Fischer", calculator.getLastName());
//            Assertions.assertEquals(183, calculator.getBodyHeight());
//            Assertions.assertEquals(75, calculator.getBodyWeight());
//            Assertions.assertEquals('M', calculator.getGender());
//        }
//
//        @Test
//        @DisplayName("BMI Test")
//        void BMI() {
//            BMICalculator calculator = new BMICalculator("Peter", "Fischer", 170, 70, 'M');
//            double result = calculator.calculateBMI();
//            Assertions.assertEquals(24.2214, result);
//
//            calculator.setbodyHeight(180);
//            calculator.setbodyweight(120);
//            double result2 = calculator.calculateBMI();
//            Assertions.assertEquals(37.037037, result2);
//
//        }
//
//        @Test
//        @DisplayName("BMI Category")
//        void BMICategory() {
//            BMICalculator calculator = new BMICalculator("Monika", "Fischer", 170, 70, 'F');
//            int result = calculator.calculateBMICategory(24.2214,'F');
//            Assertions.assertEquals(1, result);
//
//            int result2 = calculator.calculateBMICategory(37.037037,'M');
//            Assertions.assertEquals(2, result2);
//
//        }
//
//        @Test
//        @DisplayName("getBMICategoryName")
//        void getBMICategoryName() {
//            BMICalculator calculator = new BMICalculator("Monika", "Fischer", 170, 70, 'F');
//            String result = calculator.getBMICategoryName(1);
//            String result2 = calculator.getBMICategoryName(2);
//            Assertions.assertEquals("Übergewicht", result);
//            Assertions.assertEquals("Sehr starkes Übergewicht", result2);
//
//        }
//
//    }

