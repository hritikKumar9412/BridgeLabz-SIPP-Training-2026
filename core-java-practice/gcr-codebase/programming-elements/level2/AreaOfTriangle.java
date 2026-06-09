package programmingElements;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base , height ;
        System.out.println("Enter the base of the triangle: ");
        base =input.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
    }
}
