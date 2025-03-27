import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        double[] arr  = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        if (n <= 0) {
            System.out.println("can not");
        }
        else {
            double startTime = System.nanoTime();
            double res = avg(arr);
            double endTime = System.nanoTime();
            double duration  = (endTime - startTime ) / 1000000;
            System.out.println( "result: " + res);
            System.out.println("Time taken: " + duration + " milliseconds");

        }


    }

    public static double avg(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // first, sum all elements in array
        }

        return sum / arr.length; // then, divide by number of elements in array (length)
    }
}
