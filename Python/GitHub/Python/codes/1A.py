from tkinter import *
win= Tk()
top=Frame(win)
top.pack(side=TOP,fill=BOTH,expand=True)
b1=Button(top,text="red",bg="red",fg="black").pack(side=LEFT,fill=BOTH,expand=True                                                   )
b2=Button(top,text="green",bg="green",fg="black").pack(side=LEFT,fill=BOTH,expand=True)
b3=Button(top,text="green",bg="blue",fg="black").pack(side=LEFT,fill=BOTH,expand=True)
butom=Frame(win)
butom.pack(side=BOTTOM,expand=True,fill=BOTH)
b4=Button(butom,text="white",bg="white",fg="black").pack(fill=BOTH,expand=True)
mainloop()