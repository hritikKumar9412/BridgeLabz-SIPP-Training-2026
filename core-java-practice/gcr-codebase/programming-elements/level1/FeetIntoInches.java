package programmingElements;

import java.util.Scanner;

public class FeetIntoInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Height in cms");
        double height =input.nextDouble();
        double totalinch = height/2.54;
        int foot = (int) totalinch/12;
        double inches = totalinch%12;

        System.out.println("Your Height in cm is : "+height+" while in feet is : "+foot+" and inches is: "+inches);

    }
}
