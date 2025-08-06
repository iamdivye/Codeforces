import java.util.*;
public class Twice {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> count = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                count.put(a[i], count.getOrDefault(a[i], 0) + 1);
            }
            int score = 0;
            for (int val : count.values()) {
                score += val / 2;
            }
            System.out.println(score);
        }
    }
}
