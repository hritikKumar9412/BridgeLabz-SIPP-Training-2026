package Methods;

import java.util.Scanner;

public class CalendarDisplay {

    // Leap Year Check
    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    // Number of Days in Month
    public static int getDaysInMonth(
            int month,
            int year) {

        int[] days = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Month Name
    public static String getMonthName(int month) {

        String[] months = {
                "January", "February",
                "March", "April",
                "May", "June",
                "July", "August",
                "September", "October",
                "November", "December"
        };

        return months[month - 1];
    }

    // First Day using Gregorian Calendar
    public static int getFirstDay(
            int month,
            int year) {

        int totalDays = 0;

        for (int y = 1900; y < year; y++) {

            totalDays += isLeapYear(y) ? 366 : 365;
        }

        for (int m = 1; m < month; m++) {

            totalDays += getDaysInMonth(m, year);
        }

        // 1 Jan 1900 = Monday
        return (totalDays + 1) % 7;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        String monthName =
                getMonthName(month);

        int daysInMonth =
                getDaysInMonth(month, year);

        int firstDay =
                getFirstDay(month, year);

        System.out.println("\n  "
                + monthName + " "
                + year);

        System.out.println(
                "Sun Mon Tue Wed Thu Fri Sat");

        // Indentation
        for (int day = 0;
             day < firstDay;
             day++) {

            System.out.print("    ");
        }

        // Print Calendar
        for (int date = 1;
             date <= daysInMonth;
             date++) {

            System.out.printf("%3d ", date);

            if ((date + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
