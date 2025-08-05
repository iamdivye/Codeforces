import java.util.*;
public class VladandShapes {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            char[][] grid = new char[n][n];
            in.nextLine(); 
            for (int i = 0; i < n; i++) {
                grid[i] = in.nextLine().toCharArray();
            }
            List<int[]> ones = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        ones.add(new int[]{i, j});
                    }
                }
            }
            int minRow = n, maxRow = -1, minCol = n, maxCol = -1;
            for (int[] pos : ones) {
                minRow = Math.min(minRow, pos[0]);
                maxRow = Math.max(maxRow, pos[0]);
                minCol = Math.min(minCol, pos[1]);
                maxCol = Math.max(maxCol, pos[1]);
            }
            int height = maxRow - minRow + 1;
            int width = maxCol - minCol + 1;

            if (height == width) {
                boolean isSquare = true;
                for (int i = minRow; i <= maxRow && isSquare; i++) {
                    for (int j = minCol; j <= maxCol && isSquare; j++) {
                        if (grid[i][j] != '1') {
                            isSquare = false;
                        }
                    }
                }
                System.out.println(isSquare ? "SQUARE" : "TRIANGLE");
            } else {
                System.out.println("TRIANGLE");
            }
        }
    }
}
