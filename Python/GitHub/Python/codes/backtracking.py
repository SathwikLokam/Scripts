def rec(li):
    for x in li:
        if type(x)==list:
            rec(x)
        else:
            print(x,end=" ")

li=[1,42,13,[2,42,4,2,[3,4,5,42,4]],24,2,40]
rec(li)