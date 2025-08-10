import java.util.*;
public class LineBreaks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = scanner.next();
            }
            int totalLength = 0;
            int x = 0;
            for (int i = 0; i < n; i++) {
                totalLength += words[i].length();
                if (totalLength <= m) {
                    x = i + 1;
                } else {
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
