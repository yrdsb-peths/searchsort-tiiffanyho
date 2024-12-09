package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        int[] aux = new int[arr.length];// Auxiliary array for the merge.
        mergeSort(arr, aux, 0, arr.length - 1); // Recursive merge sort
    }

    public void mergeSort(int[] arr, int[] aux, int low, int high) {
        if(high <= low) { // Base case(if the subarray has one or no elements, it's already sorted.)
            return;
        }
        int middle = (low + high) / 2;
        mergeSort(arr, aux, low, middle); // Left half
        mergeSort(arr, aux, middle + 1, high); // Right half
        merge(arr, aux, low, middle, high); // Merge the two sorted halves.
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] aux, int left, int mid, int right) {
        for(int k = left; k <= right; k++) {
            aux[k] = arr[k];
        }
        // Pointers for the left and right subarrays.
        int i = left;
        int j = mid + 1;

        // Merge the two subarrays back into arr.
        for(int k = left; k <= right; k++) {
            if(i > mid) {
                arr[k] = aux[j];
                j++;
            }
            else if (j > right) {
                arr[k] = aux[i];
                i++;
            }
            else if (aux[j] < aux[i]) {
                arr[k] = aux[j];
                j++;
            }
            else {
                arr[k] = aux[i];
                i++;
            }
        }
    }
}
