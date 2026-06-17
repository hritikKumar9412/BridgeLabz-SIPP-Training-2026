package Methods;

import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive Method
    public static int findSumUsingRecursion(int number) {

        if (number == 1) {
            return 1;
        }

        return number + findSumUsingRecursion(number - 1);
    }

    // Formula Method
    public static int findSumUsingFormula(int number) {

        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Natural Number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a Natural Number greater than 0");
            return;
        }

        int recursiveSum = findSumUsingRecursion(number);

        int formulaSum = findSumUsingFormula(number);

        System.out.println("Sum using Recursion = " + recursiveSum);

        System.out.println("Sum using Formula = " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }

        scanner.close();
    }
}
