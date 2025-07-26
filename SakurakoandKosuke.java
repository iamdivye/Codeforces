import java.util.*;
public class SakurakoandKosuke {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int n=in.nextInt();
			int x=0,i=1;
			while(Math.abs(x)<=n) {
				if(x%2==0)
					x-=(2*i)-1;
				else
					x+=(2*i)-1;
				i++;
			}
			if(i%2==0)
				System.out.println("Sakurako");
			else
				System.out.println("Kosuke");
				
		}
	}

}
