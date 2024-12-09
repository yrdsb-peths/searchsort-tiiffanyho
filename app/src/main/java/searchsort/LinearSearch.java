package searchsort;

public class LinearSearch {
    /**
     * Find the index of the target element in the array arr using linear search.
     * Return -1 if target is not found in arr.
     */
    public static int find(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) { 
            // Check if current element matches target
            if(arr[i] == target) {
                return i; // Return index of target if found.

            }
        }
        return -1;
    }
}
