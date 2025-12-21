import java.util.*;
import java.io.*;

public class AbovetheClouds {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = fs.nextInt();
            String s = fs.next();

            int[] freq = new int[26];
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            boolean ok = false;
            for (int i = 1; i <= n - 2; i++) {
                if (freq[s.charAt(i) - 'a'] >= 2) {
                    ok = true;
                    break;
                }
            }

            out.append(ok ? "Yes\n" : "No\n");
        }

        System.out.print(out.toString());
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
