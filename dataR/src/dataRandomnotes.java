Webroot


JAVA icon
Lecture13Notes

/**
 * ============================================================================
 * LECTURE 13: FILE INPUT & DATA PROCESSING IN JAVA
 * ============================================================================
 * Repository: learningjava
 * Topics:
 *   1. File & Scanner setup (handling FileNotFoundException)
 *   2. Two-Pass Scanner Pattern (reading unknown line counts into fixed arrays)
 *   3. Deep Copy Constructors (encapsulation & protecting input arrays)
 *   4. Parsing Tab-Separated Files (String.split & Integer.parseInt)
 *   5. Dynamic Array Resizing (growing arrays without scanning twice)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// Note: 'import java.io.*;' imports all classes in the java.io package.

public class Lecture13Notes {

    public static void main(String[] args) throws FileNotFoundException {
        /*
         * 1. FILE & SCANNER BASICS
         * - A File object takes a String pathname.
         * - Relative path: If the file is in the project root folder (outside 'src'),
         *   just use the filename: new File("dataRandom.txt")
         * - Absolute path: Replace Windows backslashes (\) with forward slashes (/):
         *   new File("C:/Users/username/Desktop/CS115/Lecture 13/input.txt")
         * - Java requires handling FileNotFoundException (a checked exception) either
         *   with a try-catch block or by declaring 'throws FileNotFoundException' in
         *   the method header.
         */
        File dataFile = new File("dataRandom.txt");
        Scanner fileScanner = new Scanner(dataFile);

        /*
         * 2. TWO-PASS SCANNER PATTERN (Handling Unknown File Lengths)
         * Problem: Arrays have a fixed length, and we don't know how many numbers are
         * in dataRandom.txt beforehand.
         * Solution:
         *   Pass 1 -> Count how many elements exist in the file.
         *   Reset  -> Close the scanner and re-initialize it to reset to line 1.
         *   Pass 2 -> Allocate an array of size 'count' and read the numbers into it.
         */
        int count = 0;
        while (fileScanner.hasNextLine()) {
            // Note: Check hasNextDouble() in practice to avoid trailing blank-line errors
            if (fileScanner.hasNextDouble()) {
                double temp = fileScanner.nextDouble();
                count++;
            } else {
                fileScanner.nextLine(); // Skip empty/non-double lines
            }
        }

        // Reset scanner back to the start of the file
        fileScanner.close();
        fileScanner = new Scanner(dataFile);

        // Allocate array with exact size and populate on the second pass
        double[] numbers = new double[count];
        int index = 0;
        while (fileScanner.hasNextDouble() && index < count) {
            numbers[index] = fileScanner.nextDouble();
            index++;
        }

        // Always close your Scanner when finished to free system resources
        fileScanner.close();

        /*
         * 3. PARSING MULTI-LINE TAB-SEPARATED DATA (input.txt)
         * Scenario: A file has an unknown number of rows, and each row has an unknown
         * number of grades separated by tabs ("	").
         * Strategy:
         *   - Read each line as a String using nextLine().
         *   - Split the String around tabs using split("	") -> returns String[].
         *   - Convert each String token to an int using Integer.parseInt().
         *   - Resize the master int[] array dynamically as new rows are read (avoids
         *     reading and parsing the file twice).
         */
        File gradeFile = new File("input.txt");
        Scanner gradeScanner = new Scanner(gradeFile);

        int[] allGrades = new int[0]; // Start with an empty array of length 0

        while (gradeScanner.hasNextLine()) {
            String line = gradeScanner.nextLine();
            if (line.trim().isEmpty()) {
                continue; // Skip blank lines
            }

            // Split the line by tab character into a String array
            String[] tokens = line.split("\t");

            // Create a new larger array to hold existing grades + new row's grades
            int[] expanded = new int[allGrades.length + tokens.length];

            // Copy old elements over
            for (int i = 0; i < allGrades.length; i++) {
                expanded[i] = allGrades[i];
            }

            // Parse new String tokens into ints and append them
            for (int i = 0; i < tokens.length; i++) {
                expanded[allGrades.length + i] = Integer.parseInt(tokens[i].trim());
            }

            // Point allGrades to the newly resized array
            allGrades = expanded;
        }
        gradeScanner.close();

        // Test the Grades class with the parsed array
        Grades examGrades = new Grades(allGrades);
        System.out.println("Min Grade: " + examGrades.getMin());
        System.out.println("Max Grade: " + examGrades.getMax());
        System.out.println("Average:   " + examGrades.getAverage());
    }
}

/**
 * ============================================================================
 * HELPER CLASS: Grades
 * ============================================================================
 * Demonstrates private array encapsulation, deep copy constructors, and
 * standard array traversal algorithms (min, max, average).
 */
class Grades {
    // Private attribute to protect data from direct external modification
    private int[] grades;

    /**
     * Deep Copy Constructor:
     * NEVER do 'this.grades = g;' -> that creates a shallow copy (both variables
     * point to the exact same array in memory). Instead, allocate a new array
     * and copy each element individually.
     */
    public Grades(int[] g) {
        this.grades = new int[g.length];
        for (int i = 0; i < g.length; i++) {
            this.grades[i] = g[i];
        }
    }

    public int getMin() {
        if (grades.length == 0) return 0;
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public int getMax() {
        if (grades.length == 0) return 0;
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public double getAverage() {
        if (grades.length == 0) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length; // Cast to double to avoid integer division
    }
}

Analysing
