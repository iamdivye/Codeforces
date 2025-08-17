import java.util.*;
public class FindandReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Map<Character, Integer> map = new HashMap<>();
            boolean possible = true;
            
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                int parity = i % 2;
                
                if (map.containsKey(c)) {
                    if (map.get(c) != parity) {
                        possible = false; 
                        break;
                    }
                } else {
                    map.put(c, parity);
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
