import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        }


    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n);) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
