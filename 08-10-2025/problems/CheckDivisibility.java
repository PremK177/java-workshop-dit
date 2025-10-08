package problems;

import java.util.*;
public class CheckDivisibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(scan.nextLine());
        if (num % 117 == 0 && num % 217 == 0) {
            System.out.println("Number is divisible by both 117 and 217");
        } else {
            System.out.println("Number is not divisible by both 117 and 217");
        }
    }
}
