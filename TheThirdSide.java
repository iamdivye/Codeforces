import java.util.*;
public class TheThirdSide {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            if (n == 1) {
                System.out.println(sum);
            } else {
                System.out.println(sum - (n - 1));
            }
        }
    }
}
