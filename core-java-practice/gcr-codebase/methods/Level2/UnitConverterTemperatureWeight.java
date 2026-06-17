package Methods;

import java.util.Scanner;

public class UnitConverterTemperatureWeight {

    // Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        System.out.print("Enter Temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.print("Enter Weight in Pounds: ");
        double pounds = scanner.nextDouble();

        System.out.print("Enter Weight in Kilograms: ");
        double kilograms = scanner.nextDouble();

        System.out.print("Enter Volume in Gallons: ");
        double gallons = scanner.nextDouble();

        System.out.print("Enter Volume in Liters: ");
        double liters = scanner.nextDouble();

        System.out.println("\n===== Conversion Results =====");

        System.out.println(fahrenheit + " °F = "
                + convertFahrenheitToCelsius(fahrenheit) + " °C");

        System.out.println(celsius + " °C = "
                + convertCelsiusToFahrenheit(celsius) + " °F");

        System.out.println(pounds + " Pounds = "
                + convertPoundsToKilograms(pounds) + " Kilograms");

        System.out.println(kilograms + " Kilograms = "
                + convertKilogramsToPounds(kilograms) + " Pounds");

        System.out.println(gallons + " Gallons = "
                + convertGallonsToLiters(gallons) + " Liters");

        System.out.println(liters + " Liters = "
                + convertLitersToGallons(liters) + " Gallons");

        scanner.close();
    }
}
