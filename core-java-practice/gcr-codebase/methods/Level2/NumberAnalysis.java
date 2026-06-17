package Methods;

import java.util.Scanner;

public class NumberAnalysis {

    // Check Positive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Check Even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Compare Two Numbers
    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        }

        if (number1 < number2) {
            return -1;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 Numbers:");

        for (int index = 0; index < numbers.length; index++) {

            System.out.print("Number " + (index + 1) + ": ");
            numbers[index] = scanner.nextInt();
        }

        System.out.println("\n===== Number Analysis =====");

        for (int index = 0; index < numbers.length; index++) {

            int currentNumber = numbers[index];

            if (isPositive(currentNumber)) {

                System.out.print(currentNumber + " is Positive and ");

                if (isEven(currentNumber)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else if (currentNumber < 0) {

                System.out.println(currentNumber + " is Negative");

            } else {

                System.out.println(currentNumber + " is Zero");
            }
        }

        int comparisonResult =
                compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\n===== Comparison =====");

        if (comparisonResult == 1) {

            System.out.println(
                    "First element is Greater than Last element");

        } else if (comparisonResult == -1) {

            System.out.println(
                    "First element is Less than Last element");

        } else {

            System.out.println(
                    "First element is Equal to Last element");
        }

        scanner.close();
    }
}