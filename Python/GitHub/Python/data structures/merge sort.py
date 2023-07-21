li=map(int,input().split())
for x in li[:]:
    print(x)
    count=0
    for y in li:
        if x==y:
            count+=1
    if count==2:
        print(x,end=" ")