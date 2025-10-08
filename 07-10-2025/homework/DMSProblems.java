package homework;
import java.util.*;
public class DMSProblems {

    public static void main(String[] args) {
        evenOrOdd();
        biggestOfThree();
        leapYear();
        vowelOrConsonant();
        passOrFail();
    }

    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void biggestOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the biggest");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the biggest");
        } else {
            System.out.println(num3 + " is the biggest");
        }
    }

    public static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = Integer.parseInt(scanner.nextLine());
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void vowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a charc: ");
        String charc = scanner.nextLine();
        if (charc.equals("a") || charc.equals("e") || charc.equals("i") || charc.equals("o") || charc.equals("u") || charc.equals("A") || charc.equals("E") || charc.equals("I") || charc.equals("O") || charc.equals("U")) {
            System.out.println(charc + " is a vowel");
        } else {
            System.out.println(charc + " is a consonant");
        }
    }

    public static void passOrFail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = Integer.parseInt(scanner.nextLine());
        if (marks >= 35) {
            System.out.println("You passed");
        }
    }
}
