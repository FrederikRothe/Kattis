n = input()
numbers = n.split(" ")
max = max(int(numbers[0]), int(numbers[1]))
min = min(int(numbers[0]), int(numbers[1]))

spand = (max - min) + 1

for i in range(spand):
    print((min + i) + 1)


