import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();



        double startTime = System.nanoTime();
        int res = binomial(n, k);
        double endTime = System.nanoTime();
        double duration  = (endTime - startTime ) / 1000000;
        System.out.println( "result: " + res);
        System.out.println("Time taken: " + duration + " milliseconds");

    }

    public static int binomial(int n, int k) {
        if (k == 0) {
            return 1;
        }
        if (k == n) {
            return 1;
        }


        return binomial(n-1, k-1) + binomial(n-1, k);

    }
}
