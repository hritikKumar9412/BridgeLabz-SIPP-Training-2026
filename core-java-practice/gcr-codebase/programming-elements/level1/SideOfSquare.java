package programmingElements;

import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the perameter of the Square");
       int perameter = input.nextInt();

        int side = perameter/4;
        System.out.println("The length of the Side is "+side+" whose perameter is "+perameter);
    }
}
