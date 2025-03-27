import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("can not");
        }
        else {
            double startTime = System.nanoTime();
            int res = sq(a, n);
            double endTime = System.nanoTime();
            double duration  = (endTime - startTime ) / 1000000;
            System.out.println( "result: " + res);
            System.out.println("Time taken: " + duration + " milliseconds");
        }



    }

    public static int sq(int a, int n) {
        if (n == 1) { // base case when n == 1
            return 2;
        }


        return sq(a ,n-1) * a; //multiply and   call itself on less 1

    }
}
