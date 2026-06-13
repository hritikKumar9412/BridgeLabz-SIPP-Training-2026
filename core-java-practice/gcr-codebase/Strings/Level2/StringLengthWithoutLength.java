package String;

import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();

        int userLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length using charAt(): " + userLength);
        System.out.println("Length using length(): " + builtInLength);
    }
}