import java.util.*;

public class Minority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int total0 = 0, total1 = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') total0++;
                else total1++;
            }
            
            if (total0 == total1) {
                System.out.println(total0 - 1);
            } else {
                System.out.println(Math.min(total0, total1));
            }
        }
    }
}
