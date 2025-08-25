import java.util.*;
public class SashaandtheBeautifulArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int i = 0; i < n; ++i) {
                int val = sc.nextInt();
                min = Math.min(min, val);
                max = Math.max(max, val);
            }
            System.out.println(max - min);
        }
    }
}
