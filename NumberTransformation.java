import java.util.*;
public class NumberTransformation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (y % x != 0) {
                System.out.println("0 0");
            } else {
                long b = y / x;
                System.out.println("1 " + b);
            }
        }
        sc.close();
    }
}
