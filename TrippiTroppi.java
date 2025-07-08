import java.util.*;
public class TrippiTroppi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();	
		in.nextLine();
		while(t-- > 0) {
			String s[]=in.nextLine().split(" ");
			System.out.println(""+s[0].charAt(0)+s[1].charAt(0)+s[2].charAt(0));
		}
		in.close();
	}

}
