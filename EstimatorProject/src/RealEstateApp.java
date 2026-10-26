import java.util.Scanner;

public class RealEstateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Welcome the user
        System.out.println("==================================================");
        System.out.println("   Welcome to the Real Estate Price Estimator!    ");
        System.out.println("==================================================");

        boolean running = true;

        // 2. Main menu loop
        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("  1. Estimate the price of real estate");
            System.out.println("  2. Leave the program");
            System.out.print("Enter your choice (1 or 2): ");

            int choice = getValidInt(scanner);

            if (choice == 1) {
                // 3. Guide user to enter required information
                System.out.println("\n--- Real Estate Data Entry ---");

                System.out.print("Enter the name of the house or condo (e.g., Sunset Villa): ");
                scanner.nextLine(); // Clear leftover newline buffer
                String name = scanner.nextLine();

                System.out.print("Enter the size in square feet (e.g., 1500): ");
                int sqFt = getValidPositiveInt(scanner);

                System.out.print("Enter the number of bedrooms (e.g., 3): ");
                int bedrooms = getValidPositiveInt(scanner);

                System.out.print("Enter the number of bathrooms (e.g., 2): ");
                int bathrooms = getValidPositiveInt(scanner);

                // Create Estimator object
                Estimator property = new Estimator(name, bedrooms, sqFt, bathrooms);

                // Calculate estimated price
                int estimatedPrice = property.estimatePrice();

                // Print the result using a well-constructed String
                System.out.println("\n--------------------------------------------------");
                System.out.println("RESULT: Estimated Price Calculation");
                System.out.println(property);
                System.out.printf("Estimated Market Value: $%,d\n", estimatedPrice);
                System.out.println("--------------------------------------------------");

            } else if (choice == 2) {
                System.out.println("\nThank you for using the Real Estate Price Estimator. Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid option. Please enter 1 or 2.");
            }
        }

        scanner.close();
    }

    /**
     * Helper method for extra credit: validates that user enters a valid integer
     * instead of crashing on character/string input.
     */
    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            scanner.next(); // Consume invalid token
        }
        return scanner.nextInt();
    }

    /**
     * Helper method to ensure entered numerical values are positive.
     */
    private static int getValidPositiveInt(Scanner scanner) {
        int value = getValidInt(scanner);
        while (value <= 0) {
            System.out.print("Value must be greater than 0. Please re-enter: ");
            value = getValidInt(scanner);
        }
        return value;
    }
}