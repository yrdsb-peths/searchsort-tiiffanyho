package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0.0;
        }
        QuickSort quick = new QuickSort();
        quick.sort(arr);
        return median(arr);
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0.0;
        }
        MergeSort merge = new MergeSort();
        merge.sort(arr);
        return median(arr);
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0.0;
        }
        InsertionSort.sort(arr);
        return median(arr);
    }

    private double median(int[] arr) {
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

}
