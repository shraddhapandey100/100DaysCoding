print("Hello World")
print("***********************************")
def encrpt_fun(txt ,s):
    result =""
    # tranverse the plaintext
    for i in range (len(txt)):
        char = txt[i]
        # encrpt _func uppercase charaters in plain txt
        if(char.isupper()):
            result+= chr((ord(char)+s-64)%26+65)
        else:
            result+= chr((ord(char)+s-96)%26+97)
    return result
txt = input("Enter the text that you want to Encrypt by using Caesar Algorithm->")

s=int(input("Enter the number->"))
print("Plain txt->"+txt)
print("Shift pattern->"+str(s))
print("cipher->"+encrpt_fun(txt,s))
