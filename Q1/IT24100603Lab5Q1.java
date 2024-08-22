import java.util.Scanner;

public class IT24100603Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three different integers from the user
        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Find the smallest and largest numbers
        int smallest = num1;
        int largest = num1;

        // Compare the first number with the other two
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Print the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
