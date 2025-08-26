import java.util.*;
public class Cypher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] finalState = new int[n];
            for (int i = 0; i < n; ++i) {
                finalState[i] = sc.nextInt();
            }
            int[] originalState = new int[n];
            for (int i = 0; i < n; ++i) {
                int moves = sc.nextInt();
                String ops = sc.next();
                int digit = finalState[i];
                for (char op : ops.toCharArray()) {
                    if (op == 'U') {
                        digit = (digit + 9) % 10; 
                    } else if (op == 'D') {
                        digit = (digit + 1) % 10; 
                    }
                }
                originalState[i] = digit;
            }
            for (int i = 0; i < n; ++i) {
                System.out.print(originalState[i] + " ");
            }
            System.out.println();
        }
    }
}
