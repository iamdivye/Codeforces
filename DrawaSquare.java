import java.util.*;
public class DrawaSquare {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int l=in.nextInt();
			int r=in.nextInt();
			int d=in.nextInt();
			int u=in.nextInt();
			if(l==r && d==u && l==u)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
