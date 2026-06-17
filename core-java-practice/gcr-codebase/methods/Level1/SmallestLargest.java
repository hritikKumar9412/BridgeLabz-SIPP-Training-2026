package Methods;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(
            int number1,
            int number2,
            int number3) {

        int smallest =
                Math.min(number1,
                        Math.min(number2, number3));

        int largest =
                Math.max(number1,
                        Math.max(number2, number3));

        return new int[]{smallest, largest};
    }
}