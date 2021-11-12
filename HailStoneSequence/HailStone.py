n = int(input())
a = n
counter = 1
while(a != 1):
    if(a % 2 == 0):
        a = a/2
        counter = counter + 1
    else:
        a = 3*a+1
        counter = counter + 1
print(counter)

