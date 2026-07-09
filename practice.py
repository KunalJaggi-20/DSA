'''
arr = [1, 2, 4, 6, 10]
target = 8
 
Two Pointer

Output → (2, 6)

'''

arr = [1, 2, 4, 6, 10]
target = 8
left = 0
right = len(arr)-1

while left < right:

    sum = arr[left] + arr[right]

    if sum == target:
        print(arr[left], "+", arr[right], "=", target)
        break

    elif  sum < target:
        left = left + 1

    else:
            right = right - 1
