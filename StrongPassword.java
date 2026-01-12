import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            
            boolean found = false;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    char diffChar = (s.charAt(i) == 'a') ? 'b' : 'a';
                    String ans = s.substring(0, i + 1) + diffChar + s.substring(i + 1);
                    System.out.println(ans);
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                char diffChar = (s.charAt(0) == 'a') ? 'b' : 'a';
                System.out.println(diffChar + s);
            }
        }
        
        sc.close();
    }
}
