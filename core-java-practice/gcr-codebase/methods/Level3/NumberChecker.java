package Methods;

import java.util.Scanner;

public class NumberChecker {

    // Count digits
    public static int countDigits(int number) {

        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    // Store digits in array
    public static int[] getDigits(int number, int count) {

        int[] digits = new int[count];

        int temp = number;

        for (int index = count - 1; index >= 0; index--) {

            digits[index] = temp % 10;

            temp /= 10;
        }

        return digits;
    }

    // Duck Number Check
    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits) {

            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    // Armstrong Number Check
    public static boolean isArmstrongNumber(
            int number,
            int[] digits) {

        int power = digits.length;

        int sum = 0;

        for (int digit : digits) {

            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    // Largest and Second Largest
    public static int[] findLargestAndSecondLargest(
            int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {

            if (digit > largest) {

                secondLargest = largest;
                largest = digit;
            }

            else if (digit > secondLargest
                    && digit != largest) {

                secondLargest = digit;
            }
        }

        return new int[]{
                largest,
                secondLargest
        };
    }

    // Smallest and Second Smallest
    public static int[] findSmallestAndSecondSmallest(
            int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {

            if (digit < smallest) {

                secondSmallest = smallest;
                smallest = digit;
            }

            else if (digit < secondSmallest
                    && digit != smallest) {

                secondSmallest = digit;
            }
        }

        return new int[]{
                smallest,
                secondSmallest
        };
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int number = scanner.nextInt();

        int digitCount =
                countDigits(number);

        int[] digits =
                getDigits(number, digitCount);

        System.out.print("\nDigits: ");

        for (int digit : digits) {

            System.out.print(digit + " ");
        }

        System.out.println();

        // Duck Number
        System.out.println(
                "\nDuck Number: "
                        + isDuckNumber(digits));

        // Armstrong Number
        System.out.println(
                "Armstrong Number: "
                        + isArmstrongNumber(
                        number,
                        digits));

        // Largest and Second Largest
        int[] largestValues =
                findLargestAndSecondLargest(
                        digits);

        System.out.println(
                "Largest Digit = "
                        + largestValues[0]);

        System.out.println(
                "Second Largest Digit = "
                        + largestValues[1]);

        // Smallest and Second Smallest
        int[] smallestValues =
                findSmallestAndSecondSmallest(
                        digits);

        System.out.println(
                "Smallest Digit = "
                        + smallestValues[0]);

        System.out.println(
                "Second Smallest Digit = "
                        + smallestValues[1]);

        scanner.close();
    }
}
