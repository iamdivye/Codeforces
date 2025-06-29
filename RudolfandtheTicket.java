import java.util.*;
public class RudolfandtheTicket {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++)
		{
			int a =in.nextInt();
			int b=in.nextInt();
			int c =in.nextInt();
			int x[] = new int[a];
			int y[] = new int[b];
			int j,z,k=0;
			for(j=0;j<a;j++)
				x[j]=in.nextInt();
			for(j=0;j<b;j++)
				y[j]=in.nextInt();
			for(j=0;j<a;j++)
			{
				for(z=0;z<b;z++)
				{
					if(x[j]+y[z] <= c)
						k++;
				}
			}
			System.out.println(k);
		}
	}

}
