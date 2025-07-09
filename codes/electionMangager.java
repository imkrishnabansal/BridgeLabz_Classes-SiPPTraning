package codes;
import java.util.*;
public class electionMangager {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votes = new int[3]; // for 3 candidates

        while (true) {
            System.out.print("Enter age or -1 to exit: ");
            int age = sc.nextInt();
            if (age == -1) break;

            if (age >= 18) {
                System.out.print("Vote for candidate (0, 1, 2): ");
                int vote = sc.nextInt();
                if (vote >= 0 && vote <= 2) {
                    votes[vote]++;
                    System.out.println("Vote recorded.");
                } else {
                    System.out.println("Invalid candidate number.");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        System.out.println("Voting Summary:");
        for (int i = 0; i < votes.length; i++) {
            System.out.println("Candidate " + i + ": " + votes[i] + " votes");
        }

        sc.close();
    }
}
