package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        Util.shuffle(arr, null);
        quickSort(arr, 0, arr.length - 1);
    }

    /*
     * Sort the subarray arr[low..high] using quick sort algorithm.
     */
    private void quickSort(int[] arr, int low, int high) {
        if(high <= low) { // Base case: If the subarray has one or no elements, it's already sorted.
            return;
        }
        // Partition subarray and get the pivot's final position.
        int p = partition(arr, low, high);

        // Recursively sort subarrays on either side of the pivot.
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    /*
     * Partition the subarray arr[low..high] using the last element as pivot.
     * Return the index of the pivot element after partition.
     */
    private int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high + 1;

        // Loop until the two pointers meet.
        while(true) {
            // Find an element on the left greater than or equal to the pivot.
            while(arr[++i] < arr[low]) {
                if(i == high) { 
                    break;
                }
            }

            // Find an element on the right less than or equal to the pivot.
            while(arr[--j] > arr[low]) {
                if(j == low) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            // Swap elements to place them on the correct side of the pivot.
            Util.exch(arr, i, j);
        }
         // Place in its correct position.
        Util.exch(arr, low, j);
        return j;
    }

}
