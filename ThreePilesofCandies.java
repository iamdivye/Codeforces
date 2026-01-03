public class ThreePilesofCandies {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
        
    for (int i = 0; i < q; i++) {
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long sum = a + b + c;
        long result = sum / 2;            
        System.out.println(result);
        }
        
    scanner.close();
}
