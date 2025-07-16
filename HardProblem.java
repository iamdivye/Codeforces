import java.util.*;
public class HardProblem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while (t-- > 0) {
			long m = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            
            long maxRow1 = Math.min(m, a + c);
            long remainingC = c - (maxRow1 - a > 0 ? maxRow1 - a : 0);
            long maxRow2 = Math.min(m, b + remainingC);
            long totalSeated = maxRow1 + maxRow2;
            long totalSeats = 2 * m;
            long totalMonkeys = a + b + c;
            long result = Math.min(totalSeated, Math.min(totalSeats, totalMonkeys));
            System.out.println(result);
        }

	}

}
