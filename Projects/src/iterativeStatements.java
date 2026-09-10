
import java.util.Scanner;

public class iterativeStatements {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // While loop
        int y = 0;
        while (y >= 0) {
            y++; // y = y + 1
            System.out.println(y);
        }
        // While loop without curly brackets
        int i = 0;
        while (i <= 5) {
            System.out.println("i = " + (i += 1));
        }
        // While loop can be written without curly brackets
        // 6 iterations
        // Post-increment
        int j = 0;
        while (j++ <= 5) {
            System.out.print(j + " ");
        }
        // Compares j value with 5, then increases
        // Pre-increment
        int k = 0;
        while (++k <= 5) {
            System.out.print(k + " ");
        }
        // There is an alternative version of the whole statement
        // and we call it a do-while loop.
        // It has the following format.
        do {
            System.out.println("Statement2");
            System.out.println("Statement3");
        } while (false);
        // Do-while example
        int z = 0;
        do {
            z -= 1;
            System.out.println(z);
        } while (z > 0);
        // Find and print out the smallest integer
        // whose factorial is greater than 1,000,000.
        int n = 1;
        int fac = 1;
        while (fac <= 1_000_000) {
            // while n! is not greater than 1 million
            n += 1;
            fac = fac * n;
        } // fac *= n;
        System.out.println(
                "The smallest integer whose factorial is greater than 1,000,000 is " + n
        );
        // Variable assignment
        int n1, l;
        n1 = 25;
        n1 = 30;
        // String while loop
        int p = 1;
        String s = "";
        while (p != n1 && s.length() <= 1) {
            s = s + p;
            p += 1;
            System.out.print("s = " + s);
        } // p == n1 || s.length() > 1
        // For loop
        int count;
        for (count = 1; count <= 5; count = count + 1) {
            System.out.println("count = " + count);
        }
        // For loop with initialization outside
        int b = 1;
        for (; b <= 5; b++) {
            System.out.println("b = " + b);
        }
        // Counting backwards
        for (int j1 = 5; j1 > 0; j1--) {
            System.out.print("j = " + j1);
        }
        // System.out.println("j = " + j1);
        // j1 is only available inside the for loop
        // Nested for loop
        for (int j2 = 1; j2 <= 3; j2++) {
            for (int k1 = 1; k1 <= 3; k1++) {
                if (j2 == k1) {
                    System.out.println("j2 = " + j2 + ", k1 = " + k1);
                }
            }
        }
        // Break
        for (int j3 = 1; j3 <= 5; j3++) {
            if (j3 == 3) {
                break; // finish the current loop

                        }System.out.print("j = " + j3);
        }
        // Break in a nested loop
        for (int j4 = 1; j4 <= 3; j4++) {
            for (int k2 = 1; k2 <= 3; k2++) {
                System.out.println();
                break;
            }
        }
        // While loop with break
        double pointer = 580.0;
        int counter = 0;
        while (pointer > 0.5) {
            System.out.print(pointer);
            if (counter >= 10) {
                break;
            }
            counter++;
            pointer /= 2;
        }
        // Print in console
        // Scanner input
        Scanner m1 = new Scanner(System.in);
        System.out.println("Please enter an integer");
        n1 = m1.nextInt();
        // Nested loop number pattern
        for (int w = n1; w >= 1; w--) { // for n iterations
            for (int j5 = w; j5 <= n1; j5++) { // print numbers from w all the way to n
                System.out.print(j5 + " ");
            }
            System.out.println();
        }
        m1.close();
    }
}
