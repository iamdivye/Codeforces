import java.util.*;
public class DenseArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int totalInsertions = 0;
            for (int i = 0; i < n - 1; i++) {
                int small = Math.min(a[i], a[i+1]);
                int large = Math.max(a[i], a[i+1]);

                while (large > 2 * small) {
                    small *= 2;
                    totalInsertions++;
                }
            }
            System.out.println(totalInsertions);
        }
        scanner.close();
    }
}
