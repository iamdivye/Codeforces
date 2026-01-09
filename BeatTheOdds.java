import java.util.*;
import java.io.*;
public class BeatTheOdds {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int oddCount = 0;
            int evenCount = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                if (val % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            int result = n - Math.max(evenCount, oddCount);
            out.println(result);
        }
        out.flush();
    }
}
