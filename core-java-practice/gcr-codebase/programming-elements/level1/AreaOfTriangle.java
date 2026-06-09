package programmingElements;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);


                System.out.print("Enter base (in inches): ");
                double base = sc.nextDouble();

                System.out.print("Enter height (in inches): ");
                double height = sc.nextDouble();

                // Area in square inches
                double areaInInches = 0.5 * base * height;

                // Convert to square centimeters (1 inch = 2.54 cm)
                double areaInCm = areaInInches * 2.54 * 2.54;

                // Output
                System.out.println("Area in square inches: " + areaInInches);
                System.out.println("Area in square centimeters: " + areaInCm);


        }

}
