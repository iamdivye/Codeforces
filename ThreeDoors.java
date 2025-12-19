import java.util.Scanner;

public class ThreeDoors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
    
        while (t-- > 0) {
            int x = scanner.nextInt();
            int[] doors = new int[4];
            for (int i = 1; i <= 3; i++) {
                doors[i] = scanner.nextInt();
            }
            boolean[] opened = new boolean[4];
            int currentKey = x;
            int openedCount = 0;
            while (currentKey != 0 && !opened[currentKey]) {
                opened[currentKey] = true;
                openedCount++;
                currentKey = doors[currentKey]; 
            }
            if (openedCount == 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
