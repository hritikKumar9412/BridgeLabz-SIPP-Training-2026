package ControlFlow;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter Height (cm): ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Status: Normal Weight");
        } else if (bmi < 30) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}