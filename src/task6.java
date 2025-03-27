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
            System.out.println(sq(a, n));
        }



    }

    public static int sq(int a, int n) {
        if (n == 1) {
            return 2;
        }


        return sq(a ,n-1) * a;

    }
}
