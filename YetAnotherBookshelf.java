import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YetAnotherBookshelf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            String[] input = br.readLine().split(" ");
            
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            int first = -1, last = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    if (first == -1) first = i;
                    last = i;
                }
            }
            if (first == last) {
                System.out.println(0);
                continue;
            }
            int countZeros = 0;
            for (int i = first; i <= last; i++) {
                if (a[i] == 0) {
                    countZeros++;
                }
            }
            
            System.out.println(countZeros);
        }
    }
}
