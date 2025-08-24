import java.util.*;
public class CompareTShirtSizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            char la = a.charAt(a.length() - 1);
            char lb = b.charAt(b.length() - 1);

            if (a.equals(b)) {
                System.out.println("=");
            } else if (la == lb) {
                if (la == 'S') {
                    System.out.println(a.length() > b.length() ? "<" : ">");
                } else { 
                    System.out.println(a.length() > b.length() ? ">" : "<");
                }
            } else if (la == 'M') {
                System.out.println(lb == 'S' ? ">" : "<");
            } else if (lb == 'M') {
                System.out.println(la == 'S' ? "<" : ">");
            } else if (la == 'L') {
                System.out.println(">");
            } else {
                System.out.println("<");
            }
        }
    }
}
