package problems;
import java.util.*;
public class interest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int p = 1000;
        System.out.println("Enter time: ");
        int t = Integer.valueOf(scan.nextLine());
        System.out.println("Enter rate of interest: ");
        int r = Integer.valueOf(scan.nextLine());
        double interest = (p*t*r)/1000;
        System.out.println("Simple interest = " + interest);
    }
}
