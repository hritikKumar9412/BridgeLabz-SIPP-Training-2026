package String;

import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int num = (int)(Math.random() * 3);

        if (num == 0)
            return "Rock";
        else if (num == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String winner(String user,
                                String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") &&
                computer.equals("Scissors")) ||

                (user.equals("Paper") &&
                        computer.equals("Rock")) ||

                (user.equals("Scissors") &&
                        computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Games: ");
        int n = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println();
        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 1; i <= n; i++) {

            System.out.print(
                    "Enter Choice (Rock/Paper/Scissors): ");

            String user = sc.next();

            String computer =
                    computerChoice();

            String result =
                    winner(user, computer);

            if (result.equals("User"))
                userWins++;

            else if
            (result.equals("Computer"))
                computerWins++;

            System.out.println(
                    i + "\t" +
                            user + "\t" +
                            computer + "\t\t" +
                            result);
        }

        double userPercent =
                (userWins * 100.0) / n;

        double computerPercent =
                (computerWins * 100.0) / n;

        System.out.println("\nStatistics");
        System.out.println(
                "User Wins : " + userWins);

        System.out.println(
                "Computer Wins : "
                        + computerWins);

        System.out.println(
                "User Win % : "
                        + userPercent);

        System.out.println(
                "Computer Win % : "
                        + computerPercent);
    }
}