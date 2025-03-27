import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();



        System.out.println(binomial(n, k));

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
