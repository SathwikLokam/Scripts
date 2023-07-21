s=list(input())
length=len(s)
count=0
for x in range(length):
    for y in range(x+1):
        st=s[y:length-x+y]
        print(st)
print(count)