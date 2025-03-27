import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();



        double startTime = System.nanoTime();
        int res = gcd(a, b);
        double endTime = System.nanoTime();
        double duration  = (endTime - startTime ) / 1000000;
        System.out.println( "result: " + res);
        System.out.println("Time taken: " + duration + " milliseconds");

    }

    public static int gcd(int a, int b) {
        int temp = a%b;
        if (temp == 0) {
            return b;
        }


        return gcd(b, temp);

    }
}
