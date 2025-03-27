import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();



        System.out.println(gcd(a, b));

    }

    public static int gcd(int a, int b) {
        int temp = a%b;
        if (temp == 0) {
            return b;
        }


        return gcd(b, temp);

    }
}
