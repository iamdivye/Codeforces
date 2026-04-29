import java.util.*;

public class CarnivalWheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean[] visited = new boolean[l];
            int current = a;
            int max = a;

            while (!visited[current]) {
                visited[current] = true;
                max = Math.max(max, current);
                current = (current + b) % l;
            }

            System.out.println(max);
        }

        sc.close();
    }
}
