import java.util.*;
public class SquaresandCubes {
	static long kthRoot(long n, int k) {
        long x = (long)Math.pow(n, 1.0 / k);
        while (powLE(x + 1, k, n)) x++;
        while (!powLE(x, k, n)) x--;
        return x;
    }

    static boolean powLE(long base, int k, long limit) {
        long res = 1;
        for (int i = 0; i < k; i++) {
            res *= base;
            if (res > limit) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = sc.nextLong();
            long squares = kthRoot(n, 2);
            long cubes   = kthRoot(n, 3);
            long sixth   = kthRoot(n, 6); 
            long answer  = squares + cubes - sixth;
            sb.append(answer).append('\n');
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
