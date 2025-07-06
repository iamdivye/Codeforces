import java.util.*;
public class Legs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-- >0) {
			int n=in.nextInt();
			int x=n/4;
			n%=4;
			x+=n/2;
			System.out.println(x);
		}
	}

}
