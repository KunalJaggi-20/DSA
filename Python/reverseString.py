'''
str = "Hello World"
print(str[::-1])

num = '123'
print(num[::-1])

'''

str = list("Hello World")
left = 0
right = len(str)-1

while left < right:
    str[left], str[right] = str[right], str[left]
    left = left + 1
    right = right - 1 

print("".join(str))

