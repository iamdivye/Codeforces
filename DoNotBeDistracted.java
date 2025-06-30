import java.util.*;
public class DoNotBeDistracted {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=in.nextInt(),x;
			String s=in.next();
			boolean flag=true;
			for(int j=0;j<n-1;j++)
			{
				char c=s.charAt(j);
				if(!(c==s.charAt(j+1)))
				{
					x=s.lastIndexOf(c);
					if(x!=j)
					{
						flag=false;
						break;
					}
				}	
			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
