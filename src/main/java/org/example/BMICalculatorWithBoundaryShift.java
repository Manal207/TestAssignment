package org.example;

import java.util.Scanner;

public class BMICalculatorWithBoundaryShift {

    public static void main(String[] args) {

        // Prompt user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in feet: ");
        int heightFeet = scanner.nextInt();
        System.out.print("Enter your height in inches: ");
        int heightInches = scanner.nextInt();
        System.out.print("Enter your weight in pounds: ");
        int weightPounds = scanner.nextInt();

        // Calculate BMI and category
        double bmi = calculateBMI(heightFeet, heightInches, weightPounds);
        String category = getCategory(bmi);

        // Print results
        System.out.printf("Your BMI is %.1f\n", bmi);
        System.out.println("Your BMI category is " + category);

    }

    public static double calculateBMI(int heightFeet, int heightInches, int weightPounds) {
        // Convert height to meters
        double heightMeters = ((heightFeet * 12) + heightInches) * 0.0254;
        // Convert weight to kilograms
        double weightKg = weightPounds * 0.453592;
        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);
        // Return BMI
        return bmi;
    }



    public static String getCategory(double bmi) {
        // Determine BMI category
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25 - 0.1) { // lower boundary of Normal weight shifted by 0.1
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
