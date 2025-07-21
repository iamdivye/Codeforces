import java.util.*;

public class Advantage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] s = new int[n];
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < n; i++) {
                s[i] = in.nextInt();
                if (s[i] > max) {
                    max2 = max;
                    max = s[i];
                    maxIndex = i;
                } else if (s[i] > max2) {
                    max2 = s[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (i == maxIndex) {
                    System.out.print(s[i] - max2 + " ");
                } else {
                    System.out.print(s[i] - max + " ");
                }
            }
            System.out.println(); 
        }
    }
}
