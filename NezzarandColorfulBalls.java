import java.util.*;
public class NezzarandColorfulBalls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Map<Integer, Integer> freq = new HashMap<>();
            int maxFreq = 0;
            
            for (int val : a) {
                freq.put(val, freq.getOrDefault(val, 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(val));
            }
            
            System.out.println(maxFreq);
        }
        
        sc.close();
    }
}
