import java.util.*;
public class MyFirstSortingProblem {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			if(a<=b)
				System.out.println(a+" "+b);
			else
				System.out.println(b+" "+a);
		}
	}

}
