package Methods;

import java.util.Scanner;

public class StrongNumber {

    public static int factorial(int number) {

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isStrong(int number) {

        int originalNumber = number;

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            sum += factorial(digit);

            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int number = sc.nextInt();

        System.out.println(
                "Strong Number = "
                        + isStrong(number));

        sc.close();
    }
}
