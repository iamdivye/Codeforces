import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeEqual {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");

            long sum = 0;
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(input[i]);
                sum += a[i];
            }

            long target = sum / n;
            long prefixSum = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                prefixSum += a[i];

                if (prefixSum < target * (i + 1)) {
                    possible = false;
                    break;
                }
            }

            out.append(possible ? "YES\n" : "NO\n");
        }

        System.out.print(out);
    }
}
