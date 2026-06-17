package Methods;
import java.util.Scanner;

public class UnitConverter {

    // Km to Miles
    public static double convertKmToMiles(double kilometers) {
        double kmToMilesFactor = 0.621371;
        return kilometers * kmToMilesFactor;
    }

    // Miles to Km
    public static double convertMilesToKm(double miles) {
        double milesToKmFactor = 1.60934;
        return miles * milesToKmFactor;
    }

    // Meters to Feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeetFactor = 3.28084;
        return meters * metersToFeetFactor;
    }

    // Feet to Meters
    public static double convertFeetToMeters(double feet) {
        double feetToMetersFactor = 0.3048;
        return feet * feetToMetersFactor;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Distance in Kilometers: ");
        double kilometers = scanner.nextDouble();

        System.out.print("Enter Distance in Miles: ");
        double miles = scanner.nextDouble();

        System.out.print("Enter Length in Meters: ");
        double meters = scanner.nextDouble();

        System.out.print("Enter Length in Feet: ");
        double feet = scanner.nextDouble();

        System.out.println("\nConversions:");

        System.out.println(kilometers + " Km = "
                + convertKmToMiles(kilometers) + " Miles");

        System.out.println(miles + " Miles = "
                + convertMilesToKm(miles) + " Km");

        System.out.println(meters + " Meters = "
                + convertMetersToFeet(meters) + " Feet");

        System.out.println(feet + " Feet = "
                + convertFeetToMeters(feet) + " Meters");

        scanner.close();
    }
}
