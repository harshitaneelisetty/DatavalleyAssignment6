import java.util.*;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0 && num % 13 == 0) {
            int quotient7 = num / 7;
            int remainder7 = num % 7;
            int quotient13 = num / 13;
            int remainder13 = num % 13;

            System.out.println(num + " is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + quotient7);
            System.out.println("Remainder when divided by 7: " + remainder7);
            System.out.println("Quotient when divided by 13: " + quotient13);
            System.out.println("Remainder when divided by 13: " + remainder13);
        } else {
            System.out.println(num + " is not divisible by both 7 and 13 simultaneously.");
        }
    }
}
