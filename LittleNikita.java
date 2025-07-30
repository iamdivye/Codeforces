import java.util.*;
public class LittleNikita {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int n=in.nextInt();
			int m=in.nextInt();
			if((n-m)%2==0 && n>=m)
				System.out.println("Yes");
			else
				System.out.println("No");				
		}
	}

}
