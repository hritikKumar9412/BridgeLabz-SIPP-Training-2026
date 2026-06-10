package ControlFlow;
import java.util.Scanner;
public class StudentsGrade {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Physics Marks: ");
            double physics = sc.nextDouble();

            System.out.print("Enter Chemistry Marks: ");
            double chemistry = sc.nextDouble();

            System.out.print("Enter Maths Marks: ");
            double maths = sc.nextDouble();

            double percentage = (physics + chemistry + maths) / 3;

            String grade;
            String remarks;

            if (percentage >= 90) {
                grade = "A+";
                remarks = "Excellent";
            } else if (percentage >= 80) {
                grade = "A";
                remarks = "Very Good";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Good";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Average";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Needs Improvement";
            } else {
                grade = "F";
                remarks = "Fail";
            }

            System.out.println("Percentage = " + percentage);
            System.out.println("Grade = " + grade);
            System.out.println("Remarks = " + remarks);
        }

}
