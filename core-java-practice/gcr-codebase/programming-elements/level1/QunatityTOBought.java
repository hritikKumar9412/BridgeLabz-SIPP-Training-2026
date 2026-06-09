package programmingElements;

import java.util.Scanner;

public class QunatityTOBought {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Unit Price Of an Item");
        double unitPrice = input.nextDouble();
        System.out.println("Enter the Quantity of an Item");
        int quantity = input.nextInt();
        double totalPrice = unitPrice*quantity;
        System.out.println(" The total purchase price is INR "+totalPrice+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);


    }
}
