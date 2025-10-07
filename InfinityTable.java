import java.util.*;
public class InfinityTable {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long k = sc.nextLong();
            long m = (long)Math.ceil(Math.sqrt((double)k));
            long prev = (m - 1) * (m - 1);
            long mid = prev + m;
            long r, c;
            if (k <= mid) {
                r = k - prev;
                c = m;
            } else {
                r = m;
                c = m * m - k + 1;
            }
            sb.append(r).append(' ').append(c).append('\n');
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
