package problems;

import java.util.*;
public class rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int length = Integer.valueOf(scan.nextLine());
        int breadth = Integer.valueOf(scan.nextLine());
        int perimeter = 2 * (length + breadth);
        int area = length * breadth;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
