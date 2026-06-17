package Methods;

import java.util.Scanner;

public class UnitConverterAdvanced {

    // Yards to Feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeetFactor = 3.0;
        return yards * yardsToFeetFactor;
    }

    // Feet to Yards
    public static double convertFeetToYards(double feet) {
        double feetToYardsFactor = 0.333333;
        return feet * feetToYardsFactor;
    }

    // Meters to Inches
    public static double convertMetersToInches(double meters) {
        double metersToInchesFactor = 39.3701;
        return meters * metersToInchesFactor;
    }

    // Inches to Meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMetersFactor = 0.0254;
        return inches * inchesToMetersFactor;
    }

    // Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCentimetersFactor = 2.54;
        return inches * inchesToCentimetersFactor;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Yards: ");
        double yards = scanner.nextDouble();

        System.out.print("Enter Feet: ");
        double feet = scanner.nextDouble();

        System.out.print("Enter Meters: ");
        double meters = scanner.nextDouble();

        System.out.print("Enter Inches: ");
        double inches = scanner.nextDouble();

        System.out.println("\n===== Conversion Results =====");

        System.out.println(yards + " Yards = "
                + convertYardsToFeet(yards) + " Feet");

        System.out.println(feet + " Feet = "
                + convertFeetToYards(feet) + " Yards");

        System.out.println(meters + " Meters = "
                + convertMetersToInches(meters) + " Inches");

        System.out.println(inches + " Inches = "
                + convertInchesToMeters(inches) + " Meters");

        System.out.println(inches + " Inches = "
                + convertInchesToCentimeters(inches) + " Centimeters");

        scanner.close();
    }
}
