import java.util.*;
public class Imboredwithlife {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int min = Math.min(A, B);
        long fact = 1;
        for (int i = 2; i <= min; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
