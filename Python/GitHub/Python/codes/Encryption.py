def primer(nem):
    for x in range(2,nem//2):
        if nem%x==0:
            nem=nem//x
            return nem
    return nem

def texttonumeric(text,public_key):
    cipher_text=0
    private_key=public_key
    for x in text:
        private_key=primer(private_key+ord(x))

    for char_var in text:
        cipher_text=(cipher_text*private_key)+ord(char_var)
    return cipher_text,private_key

def decryption(cipher,private_key):
    pass

plain_text=input("Enter the text       : ")
public_key=int(input("Enter the public key : "))
cipher,private_key=texttonumeric(plain_text,public_key)
print(cipher,"\n",private_key)