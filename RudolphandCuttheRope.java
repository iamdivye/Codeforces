import java.util.*;
public class RudolphandCuttheRope {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a - b > 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

