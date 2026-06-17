package Methods;

import java.util.Scanner;

public class FactorOperations {

    // Find Factors and Store in Array
    public static int[] getFactors(int number) {

        int factorCount = 0;

        // Count Factors
        for (int factor = 1; factor <= number; factor++) {

            if (number % factor == 0) {
                factorCount++;
            }
        }

        int[] factors = new int[factorCount];

        int index = 0;

        // Store Factors
        for (int factor = 1; factor <= number; factor++) {

            if (number % factor == 0) {

                factors[index] = factor;
                index++;
            }
        }

        return factors;
    }

    // Greatest Factor
    public static int findGreatestFactor(int[] factors) {

        return factors[factors.length - 1];
    }

    // Sum of Factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    // Product of Factors
    public static long findProductOfFactors(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    // Product of Cubes of Factors
    public static double findProductOfCubes(int[] factors) {

        double product = 1;

        for (int factor : factors) {

            product *= Math.pow(factor, 3);
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int number = scanner.nextInt();

        int[] factors = getFactors(number);

        System.out.print("\nFactors: ");

        for (int factor : factors) {

            System.out.print(factor + " ");
        }

        System.out.println();

        System.out.println(
                "\nGreatest Factor = "
                        + findGreatestFactor(factors));

        System.out.println(
                "Sum of Factors = "
                        + findSumOfFactors(factors));

        System.out.println(
                "Product of Factors = "
                        + findProductOfFactors(factors));

        System.out.println(
                "Product of Cubes of Factors = "
                        + findProductOfCubes(factors));

        scanner.close();
    }
}