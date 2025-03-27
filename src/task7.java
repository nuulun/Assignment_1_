import java.util.Scanner;

public class task7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n  = sc.nextInt();





    }

    public static void  reverse(int n) {

        int temp = sc.nextInt();
        if (n == 1) {
            System.out.print(temp + " ");
            return;
        }
        reverse(n-1);
        System.out.print(temp + " ");


    }
}
