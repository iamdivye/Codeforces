import java.util.*;
public class RobinHelps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-- > 0) {
			int n=in.nextInt();
			int k=in.nextInt();
			int a,RobinGold=0,count=0;
			while(n-- > 0) {
				a=in.nextInt();
				if(a>=k) {
					RobinGold+=a;
				}else if(a==0 && RobinGold != 0) {
					count++;
					RobinGold--;
				}
			}
			System.out.println(count);
		}
	}

}
