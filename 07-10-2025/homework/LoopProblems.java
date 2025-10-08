package homework;

import java.util.Scanner;

public class LoopProblems {

    public static void main(String[] args) {

    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void multiplicationTable() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print multiplication table of: ");
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find result of: ");
        int num = Integer.parseInt(scan.nextLine());
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + num + " is " + result);

    }

}
