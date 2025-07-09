import java.util.*;
public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int a=in.nextInt();
			int b=in.nextInt();
			int n=in.nextInt();
			int x=0;
			while(Math.max(a, b) <= n) {
				if(Math.max(a, b) == a)
					b+=a;
				else
					a+=b;
				x++;
			}
			System.out.println(x);
		}
	}

}
