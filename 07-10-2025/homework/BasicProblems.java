package homework;
import java.util.*;
public class BasicProblems {

    public static void main(String[] args) {
        welcome();
        addition();
        areaOfRectangle();
        celciusToFahrenheit();
        sumOfDigits();
    }

    public static void welcome() {
        System.out.println("Welcome to Java Programming");
    }

    public static void addition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }

    public static void areaOfRectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle: ");
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int area = length * width;
        System.out.println("Area of rectangle = " + area);
    }

    public static void celciusToFahrenheit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celcius = Double.parseDouble(scan.nextLine());
        double fahrenheit = (celcius * 9) / 5 + 32;
        System.out.println("Temperature in fahrenheit = " + fahrenheit);
    }

    public static void sumOfDigits() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
