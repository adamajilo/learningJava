/**
 * Lecture 11: Arrays of Objects and Linear Search
 * Repository: learningjava
 */
public class Lecture11ArraysAndSearch {

    public static void main(String[] args) {
        // 1. Array of Objects (String) demonstration
        String[] arr4 = new String[5];
        arr4[0] = "Alice";
        arr4[1] = "Bob";
        arr4[2] = "Charlie";
        arr4[3] = "David";
        
        // Reference update demonstration
        arr4[4] = arr4[0];
        System.out.println("arr4[4] == arr4[0]: " + (arr4[4] == arr4[0])); // true

        arr4[4] = new String("Bob");
        System.out.println("arr4[4] == arr4[1]: " + (arr4[4] == arr4[1]));       // false (different heap objects)
        System.out.println("arr4[4].equals(arr4[1]): " + arr4[4].equals(arr4[1])); // true (same value)

        // 2. Testing largest String
        System.out.println("Largest String: " + largest(arr4));

        // 3. Testing for-each loop printing
        System.out.print("Array elements: ");
        for (String s : arr4) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 4. Testing smallest int
        int[] nums = {15, 34, 22, 14, 17, 5, 8, 22, 15, 23, 31, 22};
        System.out.println("Smallest number: " + smallest(nums));

        // 5. Testing search & rightmost search
        System.out.println("Search index for 14: " + search(nums, 14));
        System.out.println("Rightmost index for 22: " + rightmost(nums, 22));

        // 6. Testing filter (strings with length >= 5)
        String[] longStrings = atLeastLengthFive(arr4);
        System.out.print("Strings with length >= 5: ");
        for (String s : longStrings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    /**
     * Finds the largest String alphabetically in the input array.
     */
    public static String largest(String[] strs) {
        String max = strs[0];
        for (String s : strs) {
            if (s != null && s.compareTo(max) > 0) {
                max = s;
            }
        }
        return max;
    }

    /**
     * Finds the smallest integer in an int array using a for-each loop.
     */
    public static int smallest(int[] nums) {
        int min = nums[0];
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    /**
     * Searches for the leftmost index of a target integer. Returns -1 if not found.
     */
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Searches for the rightmost index of a target integer by traversing backwards.
     */
    public static int rightmost(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Searches for the rightmost index of a target integer using a tracking variable.
     */
    public static int rightmost_v2(int[] nums, int target) {
        int index_of_target = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index_of_target = i;
            }
        }
        return index_of_target;
    }

    /**
     * Searches for the leftmost index of a target String using .equals().
     */
    public static int search(String[] strs, String target) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null && strs[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns a new array containing only strings with length >= 5.
     */
    public static String[] atLeastLengthFive(String[] strs) {
        int n = 0;
        for (String s : strs) {
            if (s != null && s.length() >= 5) {
                n++;
            }
        }

        String[] output = new String[n];
        int pointer = 0;
        for (String s : strs) {
            if (s != null && s.length() >= 5) {
                output[pointer] = s;
                pointer++;
            }
        }
        return output;
    }
}