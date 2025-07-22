import java.util.*;
public class ColorfulStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String col=in.next();
		String inst=in.next();
		int x=1,c=0;
		for(int i=0;i<inst.length();i++) {
			if(c>col.length())
				break;
			if(inst.charAt(i)==col.charAt(c)) {
				c++;x++;
			}
		}
		System.out.println(x);
	}

}
