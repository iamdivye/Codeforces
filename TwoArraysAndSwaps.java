import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int na = in.nextInt();
		int b,c,t,z,s=0;
		for(int re=0;re<na;re++)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for(c=0;c<n;c++)
			{
				x[c] = in.nextInt();
			}
			for(c=0;c<n;c++)
			{
				y[c] = in.nextInt();
			}
			Arrays.sort(x);
			Arrays.sort(y);
            
            int sum = 0;
            int i = 0;
            int j = n - 1;
            int swaps = 0;
            while (swaps < k && i < n && j >= 0) {
                if (x[i] < y[j]) {
                    x[i] = y[j];
                    i++;
                    j--;
                    swaps++;
                } else {
                    break;
                }
            }
            
            for (int num : x) {
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
