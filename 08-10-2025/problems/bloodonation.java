package problems;

import java.util.*;
public class bloodonation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Enter weight");
        int weight = Integer.valueOf(scan.nextLine());
        if (age >=18 && weight >= 50) {
            System.out.println("You are eligible for blood donation");
        } else {
            System.out.println("You are not eligible for blood donation");
        }
    }
}
