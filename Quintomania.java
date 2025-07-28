import java.util.*;
public class Quintomania {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int n=in.nextInt();
			boolean flag=true;
			int old=in.nextInt(),cur=0;
			for(int i=1;i<n;i++) {
				cur=in.nextInt();
				if(Math.abs(old-cur)!=5 && Math.abs(old-cur)!=7) {
					flag=false;
				}
				old=cur;
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
