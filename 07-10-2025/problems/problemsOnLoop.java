package problems;
import java.util.*;
public class problemsOnLoop {
    public static void main(String[] args) {
        printFirstTenWholeNumbers();
    }

    public static void printFirstTenWholeNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void multiplicationTable() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print multiplication table of: ");
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }

    public static void goldenNumbers() {
        
    }

    public static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial of: ");
        int num = Integer.parseInt(scan.nextLine());
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("Factorial of " + num + " is " + result);
    }

    public static void sumAndAvgOfNaturalNumbers() {
        int sum = 0;
        for (int i = 1; i <= 45; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum/45);
    }

    
}
