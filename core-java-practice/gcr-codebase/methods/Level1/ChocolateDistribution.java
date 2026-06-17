package Methods;

public class ChocolateDistribution {

    public static int[] distribute(
            int chocolates,
            int children) {

        int eachChild = chocolates / children;

        int remaining = chocolates % children;

        return new int[]{eachChild, remaining};
    }
}
