import java.util.*;
public class DiverseTeam {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> ratingIndex = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (!ratingIndex.containsKey(a[i])) {
                ratingIndex.put(a[i], i + 1); 
            }
        }

        if (ratingIndex.size() < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int count = 0;
            for (int index : ratingIndex.values()) {
                System.out.print(index + " ");
                count++;
                if (count == k) break;
            }
            System.out.println();
        }

        sc.close();
    }
}
