import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return factorial(n-1);

    }
}
