import java.util.*;
public class SystemofEquations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int count = 0;
        for (int a = 0; a <= Math.sqrt(n); a++) {
            int b = n - a * a;
            if (b >= 0) {
                if (a + b * b == m) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
