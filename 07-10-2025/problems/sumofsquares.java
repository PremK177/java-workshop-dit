package problems;
import java.util.*;
public class sumofsquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = Integer.valueOf(scan.nextLine());
        int num2 = Integer.valueOf(scan.nextLine());
        int sum = (num1 * num1) + (num2 * num2);
        System.out.println("Sum of their squares = " + sum);
    }
}
