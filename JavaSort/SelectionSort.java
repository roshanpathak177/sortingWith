import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,29,17,3,91,70,61,20};

        for (int i = 0; i < arr.length-1; i++) {
            int min =i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]< arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]= temp;
        }
        System.out.println("The Sorted Array is: " + Arrays.toString(arr));
    }
}
