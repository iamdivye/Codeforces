import java.util.*;

public class SatisfyingConstraints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int lowerBound = Integer.MIN_VALUE; 
            int upperBound = Integer.MAX_VALUE;  
            Set<Integer> exclusions = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                int x = scanner.nextInt();
                
                if (a == 1) {
                    lowerBound = Math.max(lowerBound, x);
                } else if (a == 2) {
                    upperBound = Math.min(upperBound, x);
                } else {
                    exclusions.add(x);
                }
            }
            if (lowerBound > upperBound) {
                System.out.println(0);
                continue;
            }
            long count = upperBound - lowerBound + 1;
            for (int excl : exclusions) {
                if (excl >= lowerBound && excl <= upperBound) {
                    count--;
                }
            }
            System.out.println(Math.max(0, count));
        }
        scanner.close();
    }
}
