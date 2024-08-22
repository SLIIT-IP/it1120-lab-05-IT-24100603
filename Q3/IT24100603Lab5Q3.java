import java.util.Scanner;

public class IT24100603Lab5Q3 {
    // Constants
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_3_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input start and end dates
        System.out.print("Enter the start date (day): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (day): ");
        int endDate = scanner.nextInt();

        // Validate dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        // Calculate number of days reserved
        int daysReserved = endDate - startDate;

        // Calculate total amount
        int totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        if (daysReserved >= 3 && daysReserved <= 4) {
            totalAmount -= totalAmount * DISCOUNT_3_4_DAYS / 100;
        } else if (daysReserved >= 5) {
            totalAmount -= totalAmount * DISCOUNT_5_OR_MORE_DAYS / 100;
        }

        // Output results
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + totalAmount);

        scanner.close();
    }
}
