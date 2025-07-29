import java.util.*;
public class NewWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int p = in.nextInt();
            
            if (k == 0) {
                System.out.println(0);
                continue;
            }
            
            boolean possible = false;
            int minOperations = -1;
            
            for (int m = 1; m <= n; m++) {
                int maxSum = m * p;
                int minSum = -m * p;
                
                if (k >= minSum && k <= maxSum) {
                    possible = true;
                    minOperations = m;
                    break;
                }
            }
            
            System.out.println(possible ? minOperations : -1);
        }
    }
}
