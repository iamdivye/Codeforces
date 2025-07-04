package codeforce;
import java.util.*;
public class VladandtheBestofFive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=0,b=0;
			String s=in.next();
			for(int x=0;x<5;x++)
			{
				char c=s.charAt(x);
				if(c=='A')
					a++;
				else
					b++;
			}
			if(a>b)
				System.out.println("A");
			else
				System.out.println("B");				
		}
	}

}
