import java.util.*;
import java.io.*;

public class TeamFormation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            Long[] skills = new Long[n];
            for (int i = 0; i < n; i++) {
                skills[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(skills, Collections.reverseOrder());
            
            int teams = 0;
            long currentSize = 0;
            
            for (int i = 0; i < n; i++) {
                currentSize++;
                if (skills[i] * currentSize >= x) {
                    teams++;
                    currentSize = 0;
                }
            }
            
            result.append(teams).append("\n");
        }
        
        System.out.print(result);
    }
}
