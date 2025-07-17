import java.util.*;
public class TurtlePuzzle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int n=in.nextInt();
			int a,sum=0;
			for(int i=0;i<n;i++) {
				a=in.nextInt();
				sum+=Math.abs(a);
			}
			System.out.println(sum);
		}
	}

}
