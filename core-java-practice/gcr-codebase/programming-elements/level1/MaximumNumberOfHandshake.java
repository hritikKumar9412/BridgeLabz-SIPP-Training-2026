package programmingElements;

import java.util.Scanner;

public class MaximumNumberOfHandshake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int students = input.nextInt();
        int n =students;
        int maxHandshake = (n*(n-1))/2;
        System.out.println("The maximum number of handshake is "+maxHandshake);
    }
}
