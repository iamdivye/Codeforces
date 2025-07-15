import java.util.*;
public class TwoVessels {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			int count=0, max=Math.max(a, b),min=Math.min(a, b);
			while(max>min) {
				count++;
				min+=c;
				max-=c;
			}
			System.out.println(count);
		}
	}

}
