import java.util.Arrays;
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 29, 17, 3, 91, 70, 61, 20};
        heapSort(arr);
        System.out.println("The Sorted Array is: " + Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap from the unsorted array
        buildMaxHeap(arr, n);

        // Extract elements from the heap one by one and place them at the end of the array
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element of the heap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Build a max heap from an array
    public static void buildMaxHeap(int[] arr, int n) {
        // Start from the last non-leaf node and heapify each node in reverse order
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Heapify a subtree rooted at node 'i'
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize the largest as the root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If the left child is larger than the root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If the right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If the largest is not the root, swap the root and the largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}

