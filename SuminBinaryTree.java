import java.util.*;
public class SuminBinaryTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(); 
            long sum = 0;
            while (n > 0) {
                sum += n;
                n /= 2; 
            }
            System.out.println(sum);
        }
    }
}
