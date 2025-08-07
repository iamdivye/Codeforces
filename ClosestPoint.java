import java.util.*;
public class ClosestPoint {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (n > 2) {
                for (int i = 0; i < n; i++) {
                    in.nextInt();
                }
                System.out.println("NO");
            } else { 
                int x1 = in.nextInt();
                int x2 = in.nextInt();
                if (x2 - x1 >= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
