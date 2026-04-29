import java.util.*;

public class ChooseTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            set.add(A[i]);
        }

        int m = sc.nextInt();
        int[] B = new int[m];

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
            set.add(B[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = A[i] + B[j];
                if (!set.contains(sum)) {
                    System.out.println(A[i] + " " + B[j]);
                    return;
                }
            }
        }

        sc.close();
    }
}
