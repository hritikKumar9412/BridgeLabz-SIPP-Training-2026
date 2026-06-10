package ControlFlow;
import java.util.Scanner;
public class SumofNnaturalNumber {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a natural number.");
                return;
            }

            int i = 1;
            int sum = 0;

            while (i <= n) {
                sum += i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop = " + sum);
            System.out.println("Sum using formula = " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("Results do not match.");
            }
        }
    }

