import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        double[] arr  = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }


        System.out.println(min(arr));

    }

    public static double min(double[] arr) {
        double min  = arr[0];
        for (double v : arr) {
            if (v < min) {
                min = v;
            }
        }

        return min;
    }
}
