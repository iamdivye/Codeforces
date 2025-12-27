import java.util.*;
import java.io.*;

public class Redstone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] parts = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            
            // Check for duplicates
            Set<Integer> seen = new HashSet<>();
            boolean duplicateExists = false;
            for (int teeth : arr) {
                if (seen.contains(teeth)) {
                    duplicateExists = true;
                    break;
                }
                seen.add(teeth);
            }
            
            System.out.println(duplicateExists ? "YES" : "NO");
        }
    }
}
