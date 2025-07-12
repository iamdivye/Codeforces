import java.util.*;
public class YogurtSale {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-- > 0) {
			int n=in.nextInt();
			int a=in.nextInt();
			int b=in.nextInt();
			int total=0;
			if(b<2*a) {
				if(n%2==0)
					total=b*n/2;
				else
					total=(b*(n/2))+a;
			}else {
				total=a*n;
			}
			System.out.println(total);
		}
	}

}
