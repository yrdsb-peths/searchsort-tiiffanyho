package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        if (arr == null || arr.length == 0) {
            return -1;
        }
        if(target == arr[0]){
            return 0; 
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        return recursiveBinary(arr, target, 0, arr.length - 1);
    }

    public int recursiveBinary(int[] arr, int target, int high, int low) {
        if(high < low) {
            return -1;
        }
        int mid = (high + low) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid] > target) {
            return recursiveBinary(arr, target, mid - 1, low);
        }
        return recursiveBinary(arr, target, high, low + 1);
    }
}
