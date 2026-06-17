package Methods;

import java.util.Scanner;

public class DeficientNumber {

    public static boolean isDeficient(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }

        return sum < number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int number = sc.nextInt();

        System.out.println(
                "Deficient Number = "
                        + isDeficient(number));

        sc.close();
    }
}