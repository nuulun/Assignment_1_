import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("can not ");
        }
        else {
            double startTime = System.nanoTime();
            int res = factorial(n);
            double endTime = System.nanoTime();
            double duration  = (endTime - startTime ) / 1000000;
            System.out.println( "result: " + res);
            System.out.println("Time taken: " + duration + " milliseconds");
        }


    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1; // base case when n == 1 or n == 0
        }


        return factorial(n-1) * n; // call itself on less 1

    }
}
