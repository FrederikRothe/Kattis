n = int(input())
values = input().split()
sum = 0

for i in range(n):
    sum = sum + int(values[i])

print(sum)