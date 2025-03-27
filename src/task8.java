import java.util.Scanner;

public class task8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String n  = sc.next();






    }

    public static boolean  rfunc(String  s) {

        if (s.isEmpty()) {
            return true;
        }
        if (s.charAt(0) <= 48 || s.charAt(0) >= 57) {
            return false;
        }
        return rfunc(s.substring(1));
    }
}
