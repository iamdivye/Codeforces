import java.util.*;
public class NormalProblem {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++)
		{
			String s = in.next();
			System.out.println(rev(s));
		}
	}
	static String rev(String a)
	{
		String s="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char c=a.charAt(i);
			if(c == 'q')
				s+="p";
			else if(c == 'p')
				s+="q";
			else
				s+="w";
		}
		return s;
	}

}
