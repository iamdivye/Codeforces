import java.util.*;
public class ProblemsolvingLog {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String log = sc.next();

            int[] timeSpent = new int[26];
            for (char c : log.toCharArray()) {
                timeSpent[c - 'A']++;
            }

            int solvedCount = 0;
            for (int i = 0; i < 26; i++) {
                int requiredTime = i + 1;
                if (timeSpent[i] >= requiredTime) {
                    solvedCount++;
                }
            }
            System.out.println(solvedCount);
        }
    }
}
