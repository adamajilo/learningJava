

public class ShapeClient {

    public static void main(String[] args) {
        // Initial test objects
        Shape s1 = new Shape(4.0);
        Shape s2 = new Shape(5.0, 6.7);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.area());
        System.out.println(s2.area());
        

        
        // Scanner & Menu interactive section
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("  (a) Circle");
        System.out.println("  (b) Rectangle");
        System.out.print("Enter your choice (a/b): ");
        

        
        switch (choice) {
            case "a":
            case "A":
                System.out.print("Please enter a number as the radius of the circle: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number for the radius:");
                    scanner.next(); // clear invalid token
                }
                double r = scanner.nextDouble();
                Shape userCircle = new Shape(r);
                System.out.println("Created: " + userCircle);
                System.out.println("Area: " + userCircle.area());
                break;

            case "b":
            case "B":
                System.out.print("Please enter width and height: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter numbers for width and height:");
                    scanner.next();
                }
                double w = scanner.nextDouble();
                

                    System.out.println("Invalid input. Please enter a number for the height:");
                    scanner.next();
                }
                double h = scanner.nextDouble();
                

                System.out.println("Created: " + userRect);
                System.out.println("Area: " + userRect.area());
                break;

            default:
                System.out.println("Thank you for using this app. Not a valid choice!");
                break;
        }

        scanner.close();
    }
}