import java.util.*;
public class CipherShifer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder a = new StringBuilder();
            int i = 0;
            while (i < n) {
                char c = s.charAt(i);
                int j = i + 1;
                while (j < n && s.charAt(j) != c) j++;
                a.append(c);
                i = j + 1;
            }
            System.out.println(a.toString());
        }
    }
}
