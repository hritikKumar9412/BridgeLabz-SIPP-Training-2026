package String;

import java.util.Scanner;

public class TrimString {

    public static int[] findIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < str.length() &&
                str.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 &&
                str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String str,
                                         int start,
                                         int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static boolean compare(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        int[] indexes = findIndexes(text);

        String userTrim =
                createSubstring(text,
                        indexes[0],
                        indexes[1]);

        String builtInTrim = text.trim();

        System.out.println("User Trim : " + userTrim);
        System.out.println("Built-in Trim : " + builtInTrim);

        System.out.println(
                "Same Result : "
                        + compare(userTrim, builtInTrim));
    }
}