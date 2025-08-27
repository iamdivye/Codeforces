import java.util.*;
public class RoundDownthePrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int power = 1;
            while (power * 10 <= m) {
                power *= 10;
            }
            int d = m - power;
            System.out.println(d);
        }
    }
}
