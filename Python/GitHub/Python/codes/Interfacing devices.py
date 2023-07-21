from random import randint
def fun():
    list_k={"8255":"I/O device","8251":"USART (serial communicator)","8257":"programmable DMA","8259":"programable interrupt controller","8253":"timer interfacing device","8279":"keyboard/monitor interfacing device"}
    list_key=list(list_k.keys())
    key=list_key[randint(0,5)]
    print(key,end=" : ")
    input()
    print(list_k[key])
    fun()
fun()