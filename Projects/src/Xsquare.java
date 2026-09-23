import java.util.Scanner;

public class Xsquare {
    
    public static void square() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for the side of the square: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n; j++) {
                
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("x ");
                } else {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
        
        input.close();
    }

    public static void main(String[] args) {
        
        square();
        
    }
}