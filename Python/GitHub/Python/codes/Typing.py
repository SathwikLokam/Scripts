from random import random
import random

def re(x,y):
    import random
    text="" 
    for _ in range(random.randrange(5)):
        text=text+(chr(random.randint(x,y)))
    if(text==""):
        re(x,y)
    if (input("\nEnter the "+text+"  >>> "))==text:
        print("Correct")
        re(x,y)
    else:
        print("Error text \n\n")
        re(x,y)

def recatch():
    file=open("alpha.txt").read().splitlines()
    while(True):
        text=random.choice(file)
        if(text==""):
            continue
        if (input("\nEnter the "+text+"  >>> "))==text:
            print("Correct")
        else:
            print("Error text \n\n")

recatch()
re(ord(input("From : ")),ord(input("to : ")))
