import java.util.*;
import java.io.*;

public class EzzatandTwoSubsequences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            long[] arr = new long[n];
            
            long max = Long.MIN_VALUE;
            long sum = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(input[i]);
                sum += arr[i];
                max = Math.max(max, arr[i]);
            }
            double result = max + (sum - max) / (double)(n - 1);
            sb.append(String.format("%.9f\n", result));
        }
        
        System.out.print(sb);
    }
}
