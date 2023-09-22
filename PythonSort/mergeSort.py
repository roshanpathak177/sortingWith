def merge(left, right):
    merged = []
    left_index, right_index = 0, 0

    while left_index < len(left) and right_index < len(right):
        if left[left_index]< right[right_index]:
            merged.append(left[left_index])
            left_index += 1
        else:
            merged.append(right[right_index])
            right_index += 1
    merged.extend(left[left_index:])
    merged.extend(right[right_index:])
    
    return merged


def merge_sort(arr, left_index, right_index):
        if left_index < right_index:
            mid = (left_index + right_index)//2
            left = merge_sort(arr, left_index, mid)
            right= merge_sort(arr, mid+1, right_index)
            return merge(left, right)
        return arr[left_index:right_index + 1]

arr = [64,81,97,18,10,891,72,110,69,21,7,-56,32,-7]

sorted_arr = merge_sort(arr, 0, 13)

print("The sorted array is: ", sorted_arr)