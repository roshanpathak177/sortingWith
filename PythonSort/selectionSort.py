def selection_sort(array):
    for i in range(len(array)):
        min_index = i
        for j in range(i+1, len(array)):
            if array[j] < array[min_index]:
                min_index = j
        
        array[i], array[min_index] = array[min_index], array[i]

    return array

arr = [64,81,97,18,10,891,72,110,69,21,7,-56,32,-7]

sorted_arr = selection_sort(arr)

print("The sorted array is: ", sorted_arr)