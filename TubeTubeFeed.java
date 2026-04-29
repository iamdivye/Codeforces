import java.util.*;

public class TubeTubeFeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            int t = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int bestIndex = -1;
            int maxEntertainment = -1;

            for (int i = 0; i < n; i++) {
                int timeNeeded = i + a[i]; 
                if (timeNeeded <= t) {
                    if (b[i] > maxEntertainment) {
                        maxEntertainment = b[i];
                        bestIndex = i + 1; 
                    }
                }
            }

            System.out.println(bestIndex);
        }

        sc.close();
    }
}
