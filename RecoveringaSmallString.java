import java.util.*;
public class RecoveringaSmallString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            char[] word = new char[3];
            int first = Math.max(1, n - 52);
            word[0] = (char) ('a' + first - 1);
            int remaining = n - first;
            int second = Math.max(1, remaining - 26);
            word[1] = (char) ('a' + second - 1);
            int third = remaining - second;
            word[2] = (char) ('a' + third - 1);
            System.out.println(new String(word));
        }
    }
}
