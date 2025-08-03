import java.util.*;
public class PhoneDesktop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt(); 
            int screens = 0;
            while (y > 0) {
                screens++;
                if (y >= 2) {
                    y -= 2;
                    x -= Math.min(x, 7);
                } else {
                    y -= 1;
                    x -= Math.min(x, 11); 
                }
            }
            if (x > 0) {
                screens += (x + 14) / 15;
            }

            System.out.println(screens);
        }

    }
}
