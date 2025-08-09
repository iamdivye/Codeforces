import java.util.*;
public class LongestGoodArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            long diff = r - l;
            long result = (long) Math.floor((1 + Math.sqrt(1 + 8 * diff)) / 2.0);
            
            System.out.println(result);
        }
        sc.close();
    }
}
