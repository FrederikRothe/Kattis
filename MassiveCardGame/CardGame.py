import bisect

n = int(input())
cards = input().split()
map = dict([])
for i in range(len(cards)):
    if(cards[i] not in map):
        map[cards[i]] = 1
    else:
        tc = map[cards[i]]
        map[cards[i]] = tc + 1
pairs = int(input()) 




for i in range(pairs):
    ran = input().split()
    
    sum = 0;

    for j in range(int(ran[0]), int(ran[1])+1):
        if(str(j) in map):
            sum += map[str(j)]

    print(sum)