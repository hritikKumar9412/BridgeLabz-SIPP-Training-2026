package programmingElements;

import java.util.Scanner;

public class PerimeterOFSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perimeter = input.nextDouble();

        System.out.println("The perimeter of the triangle is: " + perimeter);

        perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

    }
}
