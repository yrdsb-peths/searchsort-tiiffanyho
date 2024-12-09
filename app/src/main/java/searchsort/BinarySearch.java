package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;

        while(min <= max) { // Loop until the search range is valid.
            int middle = (max + min) / 2;
            if(arr[middle] == target) {
                return middle;
            }
            if(arr[middle] > target) { 
                max = middle - 1;
            }
            else {
                min = middle + 1;
            }
        }
        return -1; // If the loop ends without finding the target, return -1.
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        return recursiveBinary(arr, target, arr.length - 1, 0);
    }

    public int recursiveBinary(int[] arr, int target, int max, int min) {
        // Base case
        if (max < min) {
            return -1; // Target not found
        }

        int mid = (max + min) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return recursiveBinary(arr, target, mid - 1, min); // If target is smaller than middle element, search right half
        } else {
            return recursiveBinary(arr, target, max, mid + 1); // If target is smaller than middle element, search left half
        }
    }
}
