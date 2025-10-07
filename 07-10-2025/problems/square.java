package problems;
import java.util.*;
public class square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int side = Integer.valueOf(scan.nextLine());
        int perimeter = side * 4;
        System.out.println("Perimeter = " + perimeter);
    }
}
