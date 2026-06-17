package Methods;

import java.util.Scanner;

public class YoungestAndTallestFriend {

    // Method to find index of youngest friend
    public static int findYoungest(int[] ages) {

        int youngestIndex = 0;

        for (int index = 1; index < ages.length; index++) {

            if (ages[index] < ages[youngestIndex]) {
                youngestIndex = index;
            }
        }

        return youngestIndex;
    }

    // Method to find index of tallest friend
    public static int findTallest(double[] heights) {

        int tallestIndex = 0;

        for (int index = 1; index < heights.length; index++) {

            if (heights[index] > heights[tallestIndex]) {
                tallestIndex = index;
            }
        }

        return tallestIndex;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] friendNames = {"Amar", "Akbar", "Anthony"};

        int[] friendAges = new int[3];

        double[] friendHeights = new double[3];

        // Input Ages
        System.out.println("Enter Ages:");

        for (int index = 0; index < friendNames.length; index++) {

            System.out.print(friendNames[index] + ": ");
            friendAges[index] = scanner.nextInt();
        }

        // Input Heights
        System.out.println("\nEnter Heights (in cm):");

        for (int index = 0; index < friendNames.length; index++) {

            System.out.print(friendNames[index] + ": ");
            friendHeights[index] = scanner.nextDouble();
        }

        int youngestIndex = findYoungest(friendAges);

        int tallestIndex = findTallest(friendHeights);

        System.out.println("\n===== Results =====");

        System.out.println(
                "Youngest Friend: "
                        + friendNames[youngestIndex]
                        + " (Age: "
                        + friendAges[youngestIndex]
                        + ")");

        System.out.println(
                "Tallest Friend: "
                        + friendNames[tallestIndex]
                        + " (Height: "
                        + friendHeights[tallestIndex]
                        + " cm)");

        scanner.close();
    }
}
