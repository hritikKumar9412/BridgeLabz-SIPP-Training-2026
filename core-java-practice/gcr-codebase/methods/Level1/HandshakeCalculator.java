package Methods;
import java.util.Scanner;
public class HandshakeCalculator {

        public static int calculateHandshakes(int students) {
            return (students * (students - 1)) / 2;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter students: ");
            int students = sc.nextInt();

            System.out.println(
                    "Maximum Handshakes: "
                            + calculateHandshakes(students));
        }

}
