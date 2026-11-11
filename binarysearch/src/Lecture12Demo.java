import java.util.Random;
import java.util.Arrays;

public class Lecture12Demo {

    public static void main(String[] args) {
        // --- 1. PERFORMANCE EXPERIMENT: Binary Search vs. Linear Search ---
        System.out.println("--- Running Search Performance Experiment ---");
        
        Random myRandom = new Random();
        int[] test = new int[1000000];
        
        // Populate a sorted array of 1,000,000 elements
        for (int i = 0; i < 1000000; i++) {
            test[i] = i;
        }

        // Measure Linear Search execution time (10,000 lookups)
        long start1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int target = myRandom.nextInt(1200000); // Random target (0 to 1,199,999)
            linearSearch(test, target);
        }
        long end1 = System.nanoTime();
        System.out.println("Linear Search Time: " + (end1 - start1) + " ns");

        // Measure Binary Search execution time (10,000 lookups)
        long start2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int target = myRandom.nextInt(1200000);
            binarySearch(test, target);
        }
        long end2 = System.nanoTime();
        System.out.println("Binary Search Time: " + (end2 - start2) + " ns (Much faster!)");


        // --- 2. SELECTION SORT DEMO ---
        System.out.println("\n--- Running Selection Sort Demo ---");
        int[] numbers = {15, 34, 22, 14, 17, 5, 8, 22, 15, 23, 31, 22};
        
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After sorting:  " + Arrays.toString(numbers));


        // --- 3. OBJECT (STRING) COMPARISON DEMO ---
        System.out.println("\n--- Object Comparison Demo ---");
        String word1 = "apple";
        String word2 = "banana";
        
        // .equals() checks if values match
        boolean areEqual = word1.equals("apple");
        System.out.println("word1.equals(\"apple\"): " + areEqual);

        // .compareTo() checks relative order (- negative, 0 equal, + positive)
        int comparisonResult = word1.compareTo(word2);
        System.out.println("\"apple\".compareTo(\"banana\"): " + comparisonResult + " (Negative means word1 comes before word2 alphabetically)");
    }

    // =========================================================================
    // HELPER METHODS
    // =========================================================================

    /**
     * Binary Search: Efficiently finds target in a sorted array by halving the range.
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Finds the middle point

            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }
        return -1; // Target not found
    }

    /**
     * Linear Search: Checks elements sequentially from left to right.
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Selection Sort: Finds the smallest element in the remaining unsorted portion 
     * and swaps it into the correct position using a temporary variable.
     */
    public static void selectionSort(int[] b) {
        for (int i = 0; i < b.length; i++) {
            int smallest = i;
            
            // Find the index of the smallest element in the unsorted zone
            for (int j = i; j < b.length; j++) {
                if (b[j] < b[smallest]) {
                    smallest = j;
                }
            }
            
            // Swap logic using a temporary variable so data isn't lost
            int temp = b[i];
            b[i] = b[smallest];
            b[smallest] = temp;
        }
    }
}