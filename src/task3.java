import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        double startTime = System.nanoTime();
        boolean res = isPrime(n);
        double endTime = System.nanoTime();
        double duration  = (endTime - startTime ) / 1000000;
        if (res) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
        System.out.println("Time taken: " + duration + " milliseconds");


    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // check divisibility by from 2 to square root n
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
