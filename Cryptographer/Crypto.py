import re
text = input()
r1 = re.findall("...",text)

sum = 0

for i in range(len(r1)):
    name = ['P','E','R']
    letters = re.findall(".",r1[i])
    for j in range(len(letters)):
        if name[j] != letters[j]:
            sum += 1 
print(sum)
