import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + ":");
            arr[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Element at " + i + " is " + arr[i]);
        }
    }
}
