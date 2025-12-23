import java.util.Scanner;

public class MinimalCoprime {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            
            long answer = 0;
            if (l == 1) {
                answer++;
            }
            
            long start = Math.max(l, 2);
            if (start <= r - 1) {
                answer += (r - start);
            }
            
            System.out.println(answer);
        }
        
        scanner.close();
    }
}
