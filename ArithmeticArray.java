import java.util.*;
public class ArithmeticArray 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int n=in.nextInt();
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=in.nextInt();
			}
			if(sum==n)
				System.out.println(0);
			else if(sum<n)
				System.out.println(1);
			else
				System.out.println(sum-n);				
		}
	}

}
