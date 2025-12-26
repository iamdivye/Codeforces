import java.util.Scanner;
public class EpicGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt(); 
        int n = scanner.nextInt();
        
        int stones = n;
        int turn = 0; 
        
        while (true) {
            if (turn == 0) {
                int take = gcd(a, stones);
                if (take > stones) {
                    System.out.println(1);  
                    break;
                }
                stones -= take;
            } else {
                int take = gcd(b, stones);
                if (take > stones) {
                    System.out.println(0);  
                    break;
                }
                stones -= take;
            }
            turn = 1 - turn;
        }
        
        scanner.close();
    }
    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
