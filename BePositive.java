import java.util.*;
public class BePositive {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();
            int cntNeg = 0, cntZero = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == -1) cntNeg++;
                else if (val == 0) cntZero++;
            }
            int result = cntZero + (cntNeg % 2) * 2;
            System.out.println(result);
        }

        sc.close();
    }
}
