import java.util.*;

public class FlipFlopSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            boolean hasMinusMinus = false;
            boolean hasMixed = false;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] == -1 && a[i + 1] == -1) {
                    hasMinusMinus = true;
                }
                if (a[i] != a[i + 1]) {
                    hasMixed = true;
                }
            }

            if (hasMinusMinus) {
                System.out.println(sum + 4);
            } else if (hasMixed) {
                System.out.println(sum);
            } else {
                System.out.println(sum - 4);
            }
        }

        sc.close();
    }
}
