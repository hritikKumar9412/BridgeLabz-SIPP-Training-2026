package String;

import java.util.Scanner;

public class StudentGradeCard {

    public static int[][] generateMarks(int n) {

        int[][] marks =
                new int[n][3];

        for (int i = 0; i < n; i++) {

            marks[i][0] =
                    (int)(Math.random() * 101);

            marks[i][1] =
                    (int)(Math.random() * 101);

            marks[i][2] =
                    (int)(Math.random() * 101);
        }

        return marks;
    }

    public static String getGrade(double per) {

        if (per >= 90)
            return "A+";
        else if (per >= 80)
            return "A";
        else if (per >= 70)
            return "B";
        else if (per >= 60)
            return "C";
        else if (per >= 50)
            return "D";
        else
            return "F";
    }

    public static void display(int[][] marks) {

        System.out.println(
                "Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {

            int total =
                    marks[i][0] +
                            marks[i][1] +
                            marks[i][2];

            double avg = total / 3.0;

            double per =
                    Math.round(avg * 100.0) / 100.0;

            String grade =
                    getGrade(per);

            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            total + "\t" +
                            avg + "\t" +
                            per + "\t" +
                            grade);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number of Students: ");

        int n = sc.nextInt();

        int[][] marks =
                generateMarks(n);

        display(marks);
    }
}
