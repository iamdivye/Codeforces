import java.util.*;
public class AliceandBooks {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n+1]; 
            for (int i = 1; i <= n; i++) a[i] = sc.nextLong();

            long maxPrev = Long.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                if (a[i] > maxPrev) maxPrev = a[i];
            }

            long result = a[n] + maxPrev;
            sb.append(result).append('\n');
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
