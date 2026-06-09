package programmingElements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;


        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+ num1 + " and " + num2 + " is " + sum + ", " + diff + ", " + mult + ", and " + div);

    }
}
