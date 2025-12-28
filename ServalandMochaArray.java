import java.util.Scanner;

public class ServalandMochaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean found = false;
            
            for (int i = 0; i < n && !found; i++) {
                for (int j = i + 1; j < n && !found; j++) {
                    if (gcd(arr[i], arr[j]) <= 2) {
                        found = true;
                    }
                }
            }
            
            System.out.println(found ? "Yes" : "No");
        }
        
        sc.close();
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
