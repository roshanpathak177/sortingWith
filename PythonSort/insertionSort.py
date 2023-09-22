def insertion_sort(array):
    for i in range(1, len(array)):
        current_element = array[i]
        j = i - 1
        while j >= 0 and array[j] > current_element:
            array[j + 1] = array[j]  # Shift the larger element to the right
            j -= 1  # Move left in the sorted portion
        # Insert the current_element into its correct position
        array[j + 1] = current_element
    return array

arr = [64,81,97,18,10,891,72,110,69,21,7,-56,32,-7]

sorted_arr = insertion_sort(arr)

print("The sorted array is: ", sorted_arr)