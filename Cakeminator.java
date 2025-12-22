import java.util.Scanner;
public class Cakeminator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] cake = new char[r][c];
        
        boolean[] rowHasStrawberry = new boolean[r];
        boolean[] colHasStrawberry = new boolean[c];
        
        for (int i = 0; i < r; i++) {
            String line = sc.next();
            for (int j = 0; j < c; j++) {
                cake[i][j] = line.charAt(j);
                if (cake[i][j] == 'S') {
                    rowHasStrawberry[i] = true;
                    colHasStrawberry[j] = true;
                }
            }
        }
        
        int strawberryFreeRows = 0;
        int strawberryFreeCols = 0;
        
        for (int i = 0; i < r; i++) {
            if (!rowHasStrawberry[i]) {
                strawberryFreeRows++;
            }
        }
        
        for (int j = 0; j < c; j++) {
            if (!colHasStrawberry[j]) {
                strawberryFreeCols++;
            }
        }
        
        int result = strawberryFreeRows * c + strawberryFreeCols * r - strawberryFreeRows * strawberryFreeCols;
        System.out.println(result);
        
        sc.close();
    }
}
