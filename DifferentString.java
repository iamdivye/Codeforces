import java.util.*;
public class DifferentString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine(); 
        
        for (int i = 0; i < t; i++) {
            String s = in.nextLine();
            String r = rearrangeString(s);
            if (r.equals("NO")) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(r);
            }
        }
        in.close();
    }
    
    private static String rearrangeString(String s) {
        char[] chars = s.toCharArray();
        boolean allSame = true;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[0]) {
                allSame = false;
                break;
            }
        }
        if (allSame) {
            return "NO";
        }
        
        Arrays.sort(chars);
        String sorted = new String(chars);
        if (!sorted.equals(s)) {
            return sorted;
        }
        
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != chars[i + 1]) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
                return new String(chars);
            }
        }
        
        return "NO";
    }
}
