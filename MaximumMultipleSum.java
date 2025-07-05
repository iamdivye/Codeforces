import java.util.*;
public class MaximumMultipleSum {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int t=in.nextInt();
		while(t-- > 0)
		{
			int n= in.nextInt();
			int max=0,j=0,a;
			for(int i=2;i<=n;i++)
			{
				int k=n/i;
				a=i*k*(k+1)/2;
				if(a>max)
				{
					max=a;
					j=i;
				}
			}
			System.out.println(j);
		}
	}

}
