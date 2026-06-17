package Methods;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        System.out.println("Perfect Number = "
                + isPerfect(number));

        sc.close();
    }
}