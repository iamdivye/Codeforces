import java.io.*;
import java.util.*;

public class IsamatdinandHisMagicWand {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");

            int[] a = new int[n];
            boolean hasEven = false, hasOdd = false;

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
                if (a[i] % 2 == 0) hasEven = true;
                else hasOdd = true;
            }

            if (hasEven && hasOdd) {
                Arrays.sort(a);
            }

            for (int x : a) {
                out.append(x).append(" ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }
}
