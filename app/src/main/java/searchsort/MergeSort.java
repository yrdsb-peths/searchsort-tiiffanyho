package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int[] aux, int low, int high) {
        if(high <= low) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort(arr, aux, low, middle);
        mergeSort(arr, aux, middle + 1, high);
        merge(arr, aux, low, middle, high);
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] aux, int left, int mid, int right) {
        for(int k = left; k <= right; k++) {
            aux[k] = arr[k];
        }
        int i = left;
        int j = mid + 1;
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
