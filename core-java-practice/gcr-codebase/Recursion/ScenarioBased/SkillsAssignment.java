package ScenarioBasedQuestions.Recursion;
import java.util.*;

public class SkillsAssignment {


        static void findTeams(int[] arr,
                              int index,
                              int target,
                              List<Integer> current,
                              int sum) {

            if (index == arr.length) {

                if (sum == target)
                    System.out.println(current);

                return;
            }

            current.add(arr[index]);
            findTeams(arr,
                    index + 1,
                    target,
                    current,
                    sum + arr[index]);

            current.remove(current.size() - 1);

            findTeams(arr,
                    index + 1,
                    target,
                    current,
                    sum);
        }

        public static void main(String[] args) {

            int[] arr = {2, 3, 5, 7};
            int target = 10;

            findTeams(arr,
                    0,
                    target,
                    new ArrayList<>(),
                    0);
        }

}
