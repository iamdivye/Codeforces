import java.util.Scanner;

public class AntonandDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k2 = sc.nextLong();
        long k3 = sc.nextLong();
        long k5 = sc.nextLong();
        long k6 = sc.nextLong();
        
        long x = Math.min(k2, Math.min(k5, k6));
        long remaining2 = k2 - x;
        long y = Math.min(remaining2, k3);
        long sum = x * 256 + y * 32;
        System.out.println(sum);
        
        sc.close();
    }
}
