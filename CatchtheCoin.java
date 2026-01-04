import java.util.Scanner;

public class CatchtheCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y >= -1) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out.toString());
    }
}
