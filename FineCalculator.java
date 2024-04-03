import java.util.*;

public class FineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = sc.nextInt();

        int fine = 0;
        if (daysLate <= 7) {
            fine = daysLate * 50; 
        } else if (daysLate <= 14) {
            fine = 7 * 50 + (daysLate - 7) * 100; 
        } else if (daysLate <= 21) {
            fine = 7 * 50 + 7 * 100 + (daysLate - 14) * 500; 
        } else {
            System.out.println("Your membership has been canceled.");
        }

        System.out.println("Fine: Rs. " + (fine / 100) + "/- and " + (fine % 100) + " paise");
    }
}
