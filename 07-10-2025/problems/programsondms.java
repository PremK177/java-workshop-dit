package problems;
import java.util.*;
public class programsondms {
    public static void main(String[] args) {
        brilliantOrDull();
        
    }   
    
    public static void brilliantOrDull() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your iq: ");
        int iq = Integer.valueOf(scan.nextLine());
        if (iq > 90) {
            System.out.println("You are brilliant");
        } else {
            System.out.println("You are dull");
        }
    }

    public static void centuryLeapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter century leap year: ");
        int year = Integer.valueOf(scan.nextLine());
        if (year % 100 == 0) {
            if (year % 4 == 0) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("It is not a leap year");
            }
        } else {
            System.out.println("Enter a century year");
        }
    }

    public static void divisible() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Integer.valueOf(scan.nextLine());
        if (num % 10 == 5 || num % 10 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
        int temp = num;
        int ones = temp % 10;
        temp = temp / 10;
        int tens = temp % 10;
        temp = temp / 10;
        int hundreds = temp % 10;
        int evens = tens;
        int odds = ones + hundreds;
        if ((evens - odds) % 11 == 0 || (evens - odds) % -11 == 0) {
            System.out.println("Divisible by 11");
        } else {
            System.out.println("Not divisible by 11");
        }
    }

    public static void biggestOfThree() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = Integer.valueOf(scan.nextLine());
        int num2 = Integer.valueOf(scan.nextLine());
        int num3 = Integer.valueOf(scan.nextLine());
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + " is the largest");
        }
    }

    public static void eligibleForBloodDonation() {
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

    public static void areYouSpiritual() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many temples have you visited?");
        int num = Integer.valueOf(scan.nextLine());
        if (num < 1000) {
            System.out.println("You are not spiritual");
        } else {
            System.out.println("You are spiritual");
        }
    }

}


