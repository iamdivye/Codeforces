import java.util.*;
public class RobinHoodandtheMajorOak {
	static int parityOfSum(long m) {
        int r = (int)(m % 4);
        if (r == 0 || r == 3) return 0; 
        else return 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            int p1 = parityOfSum(n);
            int p2 = parityOfSum(n - k);
            int result = (p1 ^ p2); 
            sb.append(result == 0 ? "YES\n" : "NO\n");
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
