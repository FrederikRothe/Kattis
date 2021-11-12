limits = input().split()
grade = int(input())

if(grade >= int(limits[0])):
    print("A")
elif(grade >= int(limits[1])):
    print("B")
elif(grade >= int(limits[2])):
    print("C")
elif(grade >= int(limits[3])):
    print("D")
elif(grade >= int(limits[4])):
    print("E")
else:
    print("F") 

