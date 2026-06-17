package Methods;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check voting eligibility
    public static boolean canStudentVote(int age) {

        if (age < 0) {
            return false;
        }

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] studentAges = new int[10];

        System.out.println("Enter ages of 10 students:");

        for (int index = 0; index < studentAges.length; index++) {

            System.out.print("Student " + (index + 1) + " Age: ");
            studentAges[index] = scanner.nextInt();
        }

        System.out.println("\n===== Voting Eligibility =====");

        for (int index = 0; index < studentAges.length; index++) {

            int currentAge = studentAges[index];

            if (currentAge < 0) {

                System.out.println(
                        "Student " + (index + 1)
                                + ": Invalid Age");
            }

            else if (canStudentVote(currentAge)) {

                System.out.println(
                        "Student " + (index + 1)
                                + ": Can Vote");
            }

            else {

                System.out.println(
                        "Student " + (index + 1)
                                + ": Cannot Vote");
            }
        }

        scanner.close();
    }
}
