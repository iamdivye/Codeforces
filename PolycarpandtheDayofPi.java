import java.util.*;
public class PolycarpandtheDayofPi {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0) {
			int i=0,count=0;
			String n=in.next();
			String Pi="314159265358979323846264338327";
			for(i=0;i<n.length();i++) {
				if(Pi.charAt(i)==n.charAt(i)) {
					count++;
				}else
					break;
			}
			System.out.println(count);
		}
	}

}
