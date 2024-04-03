import java.util.*;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current year: ");
        int currYear = sc.nextInt();

        System.out.print("Enter the year of joining: ");
        int yearOfJoining = sc.nextInt();

        int yearsOfService = currYear - yearOfJoining;

        int bonus = 0;
        if (yearsOfService > 5) {
            bonus = 5000;
        } else if (yearsOfService >= 3) {
            bonus = 3000;
        }

        if (bonus > 0) {
            System.out.println("Congratulations! You've been awarded a bonus of Rs. " + bonus + "/-");
        } else {
            System.out.println("No bonus is awarded.");
        }
    }
}
