import java.util.*;
public class FairPlayoff {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- >0)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			if((Math.min(a, b) < Math.max(c, d)) && (Math.min(c, d) < Math.max(a, b)))
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

}
