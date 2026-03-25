import java.util.*;

public class FizzBuzzRemixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            long blocks = n / 15;
            long rem = n % 15;
            
            long ans = blocks * 3 + Math.min(3, rem + 1);
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
