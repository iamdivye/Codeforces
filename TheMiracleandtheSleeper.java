import java.util.*;

public class TheMiracleandtheSleeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            
            long ans;
            
            if (l > r / 2) {
                ans = r % l;
            } else {
                ans = (r - 1) / 2;
            }
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
