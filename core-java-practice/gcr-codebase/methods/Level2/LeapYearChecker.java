package Methods;

import java.util.Scanner;

public class LeapYearChecker {

    // Method to check leap year
    public static boolean isLeapYear(int year) {

        if (year < 1582) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }

        scanner.close();
    }
}