import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,29,17,3,91,70,61,20};

        for (int i = 1; i < arr.length; i++) {
            int currentElement= arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > currentElement){
                arr[j+1] =arr[j];
                j--;
            }
            // Insert the current element into the correct position
            arr[j + 1] = currentElement;
        }
        System.out.println("The Sorted Array is: " + Arrays.toString(arr));
    }
}
