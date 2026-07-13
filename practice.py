arr = [0,1,0,3,12]

left = 0 

for right in range(len(arr)):
    if arr[right] != 0:
        arr[right], arr[left] = arr[left], arr[right]
        left = left + 1

print(arr)