import java.util.Scanner;

public class task7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n  = sc.nextInt();


        if (n < 0) {
            System.out.println("can not");
        }
        else {
            reverse(n);
        }



    }

    public static void  reverse(int n) {

        int temp = sc.nextInt();
        if (n == 1) {   // last number stop recursion
            System.out.print(temp + " ");
            return;
        }
        //first call function itself, then print a temp
        reverse(n-1);
        System.out.print(temp + " ");


    }
}
