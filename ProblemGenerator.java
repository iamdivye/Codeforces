import java.util.*;
public class ProblemGenerator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++)
		{
			int n =in.nextInt();
			int m =in.nextInt();
			String s =in.next();
			int a[] = new int[7];
			for(int j=0;j<s.length();j++)
			{
				char c=s.charAt(j);
				a[(int)(c)-65]+=1;
			}
			int x=0;
			for(int k=0;k<7;k++)
			{
				if(a[k]<m)
					x=x+m-a[k];
			}
			System.out.println(x);
		}
	}

}
