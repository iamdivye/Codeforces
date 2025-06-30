import java.util.*;
public class GoodKid {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=in.nextInt();
			int a[] = new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=in.nextInt();
			}
			int max=product(a);
			for(int j=0;j<n;j++)
			{
				a[j]+=1;
				if(max<product(a))
					max=product(a);
				a[j]-=1;
			}
			System.out.println(max);
		}
	}
	static int product(int[] n)
	{
		int prod=1;
		for(int a : n)
		{
			prod*=a;
		}
		return prod;
	}

}
