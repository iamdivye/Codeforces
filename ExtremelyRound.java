import java.util.*;
public class ExtremelyRound {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int p = 1; p <= n; p *= 10) {
                for (int d = 1; d <= 9; d++) {
                    int num = d * p;
                    if (num <= n) count++;
                }
            }
            System.out.println(count);
        }
    }
}
