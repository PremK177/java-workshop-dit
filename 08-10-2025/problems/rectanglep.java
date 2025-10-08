package problems;

import java.util.*;
public class rectanglep {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter length of rectangle: ");
        int length = Integer.parseInt(scan.nextLine());
        System.out.println("Enter breadth of rectangle: ");
        int breadth = Integer.parseInt(scan.nextLine());

        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}