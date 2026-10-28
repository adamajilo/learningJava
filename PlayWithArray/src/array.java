/**
 * =====================================================================
 * LECTURE 10: ARRAYS - STUDY NOTES & CODE SNIPPETS
 * =====================================================================
 * 
 * 1. WHAT IS AN ARRAY?
 *    - A fixed-length data structure storing elements of the same type 
 *      sequentially in continuous heap memory.
 *    - Handled as an object in Java (printing an array prints its data type 
 *      and heap memory address).
 *    - Has a fixed .length attribute.
 *    - Indices range from 0 to length - 1. Accessing an out-of-bounds index 
 *      triggers a runtime error.
 * 
 * 2. DECLARATION & INITIALIZATION
 *    - Inline initialization: int[] arr0 = {15, 26, 50, 12};
 *    - Using the 'new' keyword: double[] arr2 = new double[10]; (defaults to 0.0)
 * 
 * 3. ESSENTIAL ARRAY OPERATIONS (The "Loop & Process" Pattern)
 *    - Most array problems involve iterating through elements using loops.
 * 
 * 4. ADVANCED ARRAY CONCEPTS
 *    - Resizing: Fixed length means you must create a larger temp array and copy elements over.
 *    - Searching: Go through elements one by one (e.g., finding the largest element).
 * =====================================================================
 */

public class Lecture10ArraysNotes {

    public static void main(String[] args) {
        
        // =================================================================
        // SECTION 1: Declaration, Initialization, and Memory
        // =================================================================
        /*
         * int[] arr0 = {15, 26, 50, 12};
         * System.out.println(arr0);        // Prints datatype & heap address (Object behavior)
         * System.out.println(arr0.length);   // Prints quantity of items (4)
         * 
         * // Accessing elements by index (0 to length - 1)
         * System.out.println(arr0[0]);       // 15
         * System.out.println(arr0[1]);       // 26
         * 
         * // Out of bounds example (Throws Runtime Error):
         * // System.out.println(arr0[4]); 
         * 
         * // Initializing using 'new' keyword
         * double[] arr2 = new double[10];    // Allocates length * 8 bytes, fills with 0.0
         * System.out.println(arr2[2]);       // Prints 0.0
         */

        // =================================================================
        // SECTION 2: Common Loop Operations
        // =================================================================
        /*
         * int[] arr3 = new int[10];
         * 
         * // 1. Assigning values using a loop
         * for (int i = 0; i < arr3.length; i++) {
         *     arr3[i] = i;                   // arr3 becomes: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
         * }
         * 
         * // 2. Modifying specific indices
         * arr3[3]++;                         // Increases element at index 3 by 1 (3 becomes 4)
         * 
         * // 3. Printing all elements
         * for (int i = 0; i < arr3.length; i++) {
         *     System.out.print(arr3[i] + " ");
         * }
         * 
         * // 4. Counting elements smaller than 5
         * int count = 0;
         * for (int i = 0; i < arr3.length; i++) {
         *     if (arr3[i] < 5) {
         *         count++;
         *     }
         * }
         * 
         * // 5. Calculating the sum of all elements
         * int sum = 0;
         * for (int i = 0; i < arr3.length; i++) {
         *     sum += arr3[i];
         * }
         */

        // =================================================================
        // SECTION 3: Resizing an Array
        // =================================================================
        /*
         * // Arrays have a fixed length. To increase size by 2:
         * int[] temp_array = new int[arr3.length + 2]; //12 total
         * for (int i = 0; i < arr3.length; i++) {
         *     temp_array[i] = arr3[i];
         * }
         * arr3 = temp_array; // Shallow copy; old memory is garbage collected by Java
         */
    }

    // =================================================================
    // SECTION 4: Finding the Index of the Largest Element
    // =================================================================
    /**
     * Searches through an array to find the index of the maximum value.
     * 
     * @param nums The array of integers to search.
     * @return The index of the largest number, or -1 if the array is empty.
        *assume the first element is the largest then compare with others which na ladger if not replace and 
        restart
     */
    public static int largest(int[] nums) {
        if (nums.length == 0) {
            return -1; 
        }
        
        int max = nums[0];
        int max_index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                max_index = i;
            }
        }
        
        return max_index;
    }
}