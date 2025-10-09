package homework;

import java.util.Scanner;

public class LoopProblems {

    public static void main(String[] args) {
    printNumbers();
    multiplicationTable();
    factorial();
    sumOfNaturalNumbers();
    fibonacciSeries();
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
        System.out.println("Enter a number to find factorial of: ");
        int num = Integer.parseInt(scan.nextLine());
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + num + " is " + result);

    }

    public static void sumOfNaturalNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers = " + sum);
    }

    public static void fibonacciSeries() {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Enter number of terms of fibonacci series to print:");
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < c; i++) {
            int nextTerm = a + b;
            System.out.println(nextTerm);
            a = b;
            b = nextTerm;
        }
    }

}
