package Methods;

import java.util.Scanner;

public class BMICalculator {

    // Calculate BMI
    public static double calculateBMI(double weight,
                                      double heightInCm) {

        double heightInMeter = heightInCm / 100.0;

        return weight /
                (heightInMeter * heightInMeter);
    }

    // Get BMI Status
    public static String getBMIStatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";
        }

        else if (bmi < 25) {
            return "Normal";
        }

        else if (bmi < 30) {
            return "Overweight";
        }

        else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int NUMBER_OF_PERSONS = 10;

        // Column 0 = Weight
        // Column 1 = Height
        // Column 2 = BMI
        double[][] personData =
                new double[NUMBER_OF_PERSONS][3];

        // Input Data
        for (int person = 0;
             person < NUMBER_OF_PERSONS;
             person++) {

            System.out.println(
                    "\nEnter Details of Person "
                            + (person + 1));

            System.out.print("Weight (kg): ");
            personData[person][0] =
                    scanner.nextDouble();

            System.out.print("Height (cm): ");
            personData[person][1] =
                    scanner.nextDouble();

            personData[person][2] =
                    calculateBMI(
                            personData[person][0],
                            personData[person][1]);
        }

        System.out.println(
                "\n========== BMI REPORT ==========");

        System.out.printf(
                "%-10s %-10s %-10s %-15s%n",
                "Weight",
                "Height",
                "BMI",
                "Status");

        for (int person = 0;
             person < NUMBER_OF_PERSONS;
             person++) {

            double weight =
                    personData[person][0];

            double height =
                    personData[person][1];

            double bmi =
                    personData[person][2];

            String status =
                    getBMIStatus(bmi);

            System.out.printf(
                    "%-10.2f %-10.2f %-10.2f %-15s%n",
                    weight,
                    height,
                    bmi,
                    status);
        }

        scanner.close();
    }
}