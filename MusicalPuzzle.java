import java.util.*;
public class MusicalPuzzle {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Set<String> twoNoteMelodies = new HashSet<>();
            for (int i = 0; i < n - 1; i++) {
                twoNoteMelodies.add(s.substring(i, i + 2));
            }
            System.out.println(twoNoteMelodies.size());
        }
    }
}
