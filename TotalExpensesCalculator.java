import java.util.*;

public class TotalExpensesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = sc.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = sc.nextDouble();

        double totalExpenses = quantity * pricePerItem;

        double discount = 0;
        if (quantity > 50) {
            discount = 0.1 * totalExpenses; 
        } else if (quantity >= 25 && quantity <= 50) {
            discount = 0.05 * totalExpenses; 
        }

        double totalExpensesAfterDiscount = totalExpenses - discount;

        System.out.println("Total expenses: Rs. " + totalExpensesAfterDiscount + "/-");
    }
}
