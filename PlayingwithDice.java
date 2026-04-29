import java.util.*;

public class PlayingwithDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int first = 0, draw = 0, second = 0;

        for (int x = 1; x <= 6; x++) {
            int d1 = Math.abs(a - x);
            int d2 = Math.abs(b - x);

            if (d1 < d2) {
                first++;
            } else if (d1 > d2) {
                second++;
            } else {
                draw++;
            }
        }

        System.out.println(first + " " + draw + " " + second);

        sc.close();
    }
}
