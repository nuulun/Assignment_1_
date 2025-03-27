import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("cannot");
        }
        else {
            double startTime = System.nanoTime();
            int res = fib(n);
            double endTime = System.nanoTime();
            double duration  = (endTime - startTime ) / 1000000;
            System.out.println( "result: " + res);
            System.out.println("Time taken: " + duration + " milliseconds");
        }

    }

    public static int fib(int n) {
        // base case when n== 1 and n == 0
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        return fib(n-1) + fib((n-2)); // call itself on less 1 and 2

    }
}
