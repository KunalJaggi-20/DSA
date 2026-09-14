arr = [3,7,2,9,5,8]

largest = arr[0]
sec_larg = 0

for i in range(1,len(arr)):
    
    if largest < arr[i]:
        sec_larg = largest
        largest = arr[i]
    
    elif sec_larg < arr[i] and arr[i] != largest:
        sec_larg = arr[i]



print(largest)
print(sec_larg)