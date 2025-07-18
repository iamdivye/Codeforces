import java.util.*;
public class OneandTwo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int totalTwos = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (a[i] == 2) {
                    totalTwos++;
                }
            }
            if (totalTwos % 2 != 0) {
                System.out.println(-1);
                continue;
            }
            int requiredTwos = totalTwos / 2;
            int currentTwos = 0;
            int k = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == 2) {
                    currentTwos++;
                }
                if (currentTwos == requiredTwos) {
                    k = i + 1; 
                    break;
                }
            }
            System.out.println(k);
        }
    }
}
