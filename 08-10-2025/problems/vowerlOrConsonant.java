package problems;
import java.util.*;
public class vowerlOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a charc: ");
        String charc = scan.nextLine();
        if (charc.equals("a") || charc.equals("e") || charc.equals("i") || charc.equals("o") || charc.equals("u") || charc.equals("A") || charc.equals("E") || charc.equals("I") || charc.equals("O") || charc.equals("U")) {
            System.out.println(charc + " is a vowel");
        } else {
            System.out.println(charc + " is a consonant");
        }
    }
}
