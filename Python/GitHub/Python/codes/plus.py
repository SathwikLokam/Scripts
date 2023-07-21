from tkinter import *
from tkinter import messagebox
def fun1():
    messagebox.showinfo("Mesaage","You clicked red ")
roo=Tk()
b1=Button(text="red",fg="red",bg="black",command=fun1)
b1.pack(side=LEFT)
b2=Button(text="blue",fg="blue",bg="black")
b2.pack(side=TOP)
b3=Button(text="green",fg="green",bg="black")
b3.pack(side=BOTTOM)
b4=Button(text="yellow",fg="yellow",bg="black")
b4.pack(side=RIGHT)