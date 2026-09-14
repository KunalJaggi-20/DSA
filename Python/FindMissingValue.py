arr = [9, 6, 4, 2, 3, 5, 7, 0, 1]
num = 0

for i in range(0,len(arr)):
    
    if num in arr:
        num = num + 1
    else:
        print("Missing value : ",num)
        break