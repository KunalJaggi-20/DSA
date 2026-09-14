arr1 = [1, 2, 3, 4]
arr2 = [3, 4, 5, 6]

arr3 = []

for i in range(len(arr1)):
    
    if arr1[i] not in arr3:
        ele = arr1[i]
        arr3.append(ele)

for i in range(len(arr2)):
    
    if arr2[i] not in arr3:
        ele = arr2[i]
        arr3.append(ele)
        
print(arr3)