import java.util.Scanner;

public class task8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String n  = sc.next();



        double startTime = System.nanoTime();
        boolean res = rfunc(n);
        double endTime = System.nanoTime();
        double duration  = (endTime - startTime ) / 1000000;
        if (res) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println("Time taken: " + duration + " milliseconds");



    }

    public static boolean  rfunc(String  s) {

        if (s.isEmpty()) {
            return true;
        }
        if (s.charAt(0) <= 48 || s.charAt(0) >= 57) { // checking if it is not a number with unicode
            return false;
        }
        return rfunc(s.substring(1)); // cutting first char in string
    }
}
