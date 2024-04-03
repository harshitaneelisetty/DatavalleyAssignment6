import java.util.*;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int cnt = 0;

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number (or type 'stop' to end): ");
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                smallest = Math.min(smallest, number);
                largest = Math.max(largest, number);
                sum += number;
                cnt++;
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("stop")) {
                    continueInput = false;
                } else {
                    System.out.println("Invalid input. Please enter a valid number or 'stop' to end.");
                }
            }
        }

        if (cnt > 0) {
            double average = (double) sum / cnt;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average of all numbers: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
