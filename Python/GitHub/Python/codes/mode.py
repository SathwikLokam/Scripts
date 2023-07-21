limit=int(input("Enter the limit : "))
a_list=[]
count=0
moderep=0
print("Enter the values")
for x in range(limit):
    a_list.append(int(input()))
for x in a_list:
    for y in a_list:
        if x==y:
            count=count+1
    if count>moderep:
        moderep=count
        mode=x
    count=0
print("moderep : ",moderep," mode : ",mode)