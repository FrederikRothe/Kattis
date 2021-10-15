import re
n = int(input())
cups = {}

for i in range(n):
    scannerInput = input().split()
    print(i)
    if (scannerInput[0].isdigit()):
        cups[scannerInput[1]] = scannerInput[0]
        print("FIRST is DIGIT " + scannerInput[0])
    else:
        cups[scannerInput[0]] = scannerInput[1]
        print("SECOND is DIGIT " + scannerInput[1])

print(cups)