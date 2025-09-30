import java.util.*;
public class MedianofanArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);

            int medianIndex = (n - 1) / 2;
            int medianValue = arr[medianIndex];
            long target = medianValue + 1;

            long ops = 0;
            for (int i = medianIndex; i < n; i++) {
                if (arr[i] < target) {
                    ops += target - arr[i];
                }
            }

            sb.append(ops).append("\n");
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
