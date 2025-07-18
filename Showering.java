import java.util.*;
public class Showering {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int n=in.nextInt();
			int s=in.nextInt();
			int m=in.nextInt();
			int l,r,max=0,temp,r0=0;
			for(int i=0;i<n;i++) {
				l=in.nextInt();
				r=in.nextInt();
				if(i==0) {
					max=l;
				}else {
					temp=l-r0;
					if(temp>max)
						max=temp;
				}
				r0=r;
			}
			temp=m-r0;
			if(temp>max)
				max=temp;
			if(max>=s)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
