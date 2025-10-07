package problems;

import java.util.*;;

public class parallelogram {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter base and height of //gram: ");
        int base = Integer.valueOf(scan.nextLine());
        int height = Integer.valueOf(scan.nextLine());
        double area = base * height;
        System.out.println(area);
    }
}
