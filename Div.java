import java.util.*;
public class Div {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 7 == 0) {
                System.out.println(n);
            } else {
                int prefix = n / 10;
                for (int i = 0; i < 10; i++) {
                    int newNum = prefix * 10 + i;
                    if (newNum % 7 == 0) {
                        System.out.println(newNum);
                        break;
                    }
                }
            }
        }
    }
}
