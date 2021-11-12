inp = input().split()
n = int(inp[0])
m = int(inp[1])
values = input().split()

currentSum = 0
rejected = 0

for i in range(m):
    if(currentSum + int(values[i]) > n):
        rejected = m-i
        break
    else:
        currentSum = currentSum + int(values[i])
print(rejected)
    

