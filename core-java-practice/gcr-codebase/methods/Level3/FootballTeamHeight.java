package Methods;

public class FootballTeamHeight {

    // Generate random heights between 150 and 250
    public static int[] generateHeights(int size) {

        int[] heights = new int[size];

        for (int index = 0; index < heights.length; index++) {
            heights[index] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    // Find sum of heights
    public static int findSum(int[] heights) {

        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    // Find mean height
    public static double findMeanHeight(int[] heights) {

        int sum = findSum(heights);

        return (double) sum / heights.length;
    }

    // Find shortest player
    public static int findShortestHeight(int[] heights) {

        int shortest = heights[0];

        for (int height : heights) {

            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    // Find tallest player
    public static int findTallestHeight(int[] heights) {

        int tallest = heights[0];

        for (int height : heights) {

            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        int numberOfPlayers = 11;

        int[] playerHeights =
                generateHeights(numberOfPlayers);

        System.out.println("Player Heights:");

        for (int height : playerHeights) {
            System.out.print(height + " ");
        }

        System.out.println("\n");

        int shortestHeight =
                findShortestHeight(playerHeights);

        int tallestHeight =
                findTallestHeight(playerHeights);

        double meanHeight =
                findMeanHeight(playerHeights);

        System.out.println(
                "Shortest Height = "
                        + shortestHeight + " cm");

        System.out.println(
                "Tallest Height = "
                        + tallestHeight + " cm");

        System.out.println(
                "Mean Height = "
                        + meanHeight + " cm");
    }
}