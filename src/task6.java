import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int n = 10;



    }

    public static int sq(int a, int n) {
        if (n == 1) {
            return 2;
        }


        return sq(a ,n-1) * a;

    }
}
