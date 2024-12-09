package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        // Loop through each position in array except last one.
        for(int i = 0; i < arr.length - 1; i++) {
            int index = i;

            // Find index of smallest element in remaining unsorted portion.
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            // Swap smallest element found with first unsorted element.
            Util.exch(arr, i, index);
        }
    }
}
