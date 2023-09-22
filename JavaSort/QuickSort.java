import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 29, 17, 3, 91, 70, 61, 20};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("The Sorted Array is: " + Arrays.toString(arr));
        
    }

    public static void quickSort(int[]arr, int left, int right){
        if(left<right) {
            int pivotIndex = partition(arr, left, right);

            quickSort(arr, left, pivotIndex -1);
            quickSort(arr, pivotIndex, right);
        }
    }

    public static int partition(int[]arr, int left, int right){
        int pivot = arr [left + (right - left)/2];
        int i = left;
        int j = right;

        while(i<=j){
           while(arr[i] < pivot){
               i++;
           }
           while(arr[j] > pivot){
               j--;
           }
            if (i <= j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}
