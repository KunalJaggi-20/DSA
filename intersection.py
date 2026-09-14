arr1 = [1, 2, 3, 4, 5]
arr2 = [3, 4, 5, 6, 7]

arr3 = []

for i in range(len(arr1)):
    
    if arr1[i] in arr2:
        ele = arr1[i]
        arr3.append(ele)
        
print(arr3)