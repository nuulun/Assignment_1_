import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        double[] arr  = new double[n];

        if (n <= 0) {
            System.out.println("can not");
        }
        else {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextDouble();
            }

            double startTime = System.nanoTime();
            double res = min(arr);
            double endTime = System.nanoTime();
            double duration  = (endTime - startTime ) / 1000000;
            System.out.println( "result: " + res);
            System.out.println("Time taken: " + duration + " milliseconds");
        }



    }

    public static double min(double[] arr) {
        double min  = arr[0]; // initial min value takes first element from array
        for (double v : arr) {
            if (v < min) {  // compare with other el in array
                min = v;
            }
        }

        return min;
    }
}
