import java.util.*;
public class StoneGame {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int n=in.nextInt();
			int a,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,maxp=0,minp=0,step=0;
			for(int i=0;i<n;i++) {
				a=in.nextInt();
				if(a<min) {
					min=a;
					minp=i+1;
				}
				if(a>max) {
					max=a;
					maxp=i+1;
				}
			}
			int s1 = Math.max(maxp, minp);
            int s2 = Math.max(n - maxp + 1, n - minp + 1);
            int s3 = Math.min(maxp + (n - minp + 1), minp + (n - maxp + 1));
            step = Math.min(s1, Math.min(s2, s3));
			System.out.println(step);
		}
	}

}
