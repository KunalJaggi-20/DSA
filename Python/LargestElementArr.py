arr = [3,7,2,9,5]

temp = arr[0]

for i in range(len(1,arr)):
    if temp < arr[i]:
        temp = arr[i]


print(temp)
