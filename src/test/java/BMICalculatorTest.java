import org.example.BMICalculator;
import org.junit.Test;
import static org.junit.Assert.*;



public class BMICalculatorTest {

    @Test
    public void testCalculateBMI() {
        // Test case 1: height = 5'6", weight = 150 lbs -> BMI = 24.2
        double expected1 = 24.2;
        double actual1 = BMICalculator.calculateBMI(5, 6, 150);
        assertEquals(expected1, actual1, 0.1);

        // Test case 2: height = 6'0", weight = 200 lbs -> BMI = 27.1
        double expected2 = 27.1;
        double actual2 = BMICalculator.calculateBMI(6, 0, 200);
        assertEquals(expected2, actual2, 0.1);
    }

    @Test
    public void testGetCategory() {
        // Test case 1: BMI = 17.5 -> Underweight
        String expected1 = "Underweight";
        String actual1 = BMICalculator.getCategory(17.5);
        assertEquals(expected1, actual1);

        // Test case 2: BMI = 23.5 -> Normal weight
        String expected2 = "Normal weight";
        String actual2 = BMICalculator.getCategory(23.5);
        assertEquals(expected2, actual2);

        // Test case 3: BMI = 27.5 -> Overweight
        String expected3 = "Overweight";
        String actual3 = BMICalculator.getCategory(27.5);
        assertEquals(expected3, actual3);

        // Test case 4: BMI = 35.5 -> Obese
        String expected4 = "Obese";
        String actual4 = BMICalculator.getCategory(35.5);
        assertEquals(expected4, actual4);
    }

}
