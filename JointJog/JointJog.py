import math
input = input().split()
print(max(math.hypot(int(input[2]) - int(input[0]), int(input[3]) - int(input[1])),math.hypot(int(input[6]) - int(input[4]), int(input[7]) - int(input[5]))))