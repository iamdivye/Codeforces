import java.util.*;

public class MovingChips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int left = -1, right = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    if (left == -1) left = i;
                    right = i;
                }
            }
            int countZeros = 0;
            
            for (int i = left; i <= right; i++) {
                if (a[i] == 0) countZeros++;
            }
            System.out.println(countZeros);
        }
        sc.close();
    }
}
