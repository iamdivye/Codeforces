import java.util.*;
public class SakurakosExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();

        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            int totalSum = a + 2 * b;

            if (totalSum % 2 != 0) {
                System.out.println("NO");
            } else {
                int halfSum = totalSum / 2;
                boolean possible = false;
                for (int twos = 0; twos <= b; twos++) {
                    int sumWithTwos = twos * 2;
                    if (sumWithTwos <= halfSum && (halfSum - sumWithTwos) <= a) {
                        possible = true;
                        break;
                    }
                }

                System.out.println(possible ? "YES" : "NO");
            }
        }
        in.close();
    }
}
