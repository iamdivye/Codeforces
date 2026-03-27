import java.util.*;

public class ThreeDecks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            long sum = a + b + c;
            
            if (sum % 3 != 0) {
                System.out.println("NO");
                continue;
            }
            
            long x = sum / 3;
            
            if (x >= b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
