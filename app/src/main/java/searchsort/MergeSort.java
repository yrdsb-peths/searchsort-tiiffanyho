package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) {
            return; 
        }
        int mid = arr.length / 2;
        int[] min = new int[mid];
        int[] max = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            min[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            max[i - mid] = arr[i];
        }
        sort(min);
        sort(max);
        merge(arr, min, max);
    }
    
    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];

            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
