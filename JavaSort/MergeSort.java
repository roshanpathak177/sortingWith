import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {2, 6, 29, 17, 3, 91, 70, 61, 20};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("The Sorted Array is: " + Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int middle = left + (right - left) / 2;

            // Recursively sort the left and right halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left +1;
        int n2 = right -mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        // Merge the two subarrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the leftArray, if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the rightArray, if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
