import re
number = int(input())

def hashad(numberString):
    x = [int(a) for a in str(numberString)]
    sum = 0
    for i in range(len(x)):
        sum += int(x[i])
    if int(numberString) % sum == 0:
        return int(numberString)
    else:
        return hashad(int(numberString) + 1)

print(hashad(number))
