package problems;
import java.util.*;
public class rootcheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Considering ax^2 + bx + c = 0, enter a, b and c:");
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        double result = Math.pow(b, 2) - 4 * a * c;

        if (result > 0) {
            System.out.println("The roots are real and distinct");
        } else {
            System.out.println("The roots are not real/distinct");
        }
    }
}