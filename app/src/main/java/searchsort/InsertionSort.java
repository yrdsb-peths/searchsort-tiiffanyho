package searchsort;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    public static void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            // Compare the current element with the elements before it.
            for(int j = i; j > 0; j--){
                if(arr[j - 1] > arr[j])
                {
                    // If the previous is greater than current swap to maintain the sorted order.
                    Util.exch(arr, j - 1, j);
                }
            }
        }
    }
}
