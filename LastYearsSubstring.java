import java.util.Scanner;

public class LastYearsSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            boolean possible = false;
            for (int x = 0; x <= 4; x++) {
                int fromEnd = 4 - x;
                String startPart = s.substring(0, x);
                String endPart = s.substring(n - fromEnd);
                String targetStart = "2020".substring(0, x);
                String targetEnd = "2020".substring(x);
                
                if (startPart.equals(targetStart) && endPart.equals(targetEnd)) {
                    possible = true;
                    break;
                }
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
        
        scanner.close();
    }
}
