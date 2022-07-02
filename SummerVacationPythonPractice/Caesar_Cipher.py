# A Python program to illustrate Ceasar Cipher Technique


def encrypt(text,s):
    result= ""

    # traverse text

    for i in range(len(text)):
        char = text[i]

        # Encrypt upepercase characters
        if(char.isupper()):
            result += chr((ord(char)+s-65)%26+65)

        # Encrypt lowercase characters
        else:
            result+=chr((ord(char)+s-97)%26+97)
    return result


# Check the above function

text = "SHRADDHAPANDEY"

s=2

print("Text :"+text)

print("Shift: "+text)

print("Shift :"+str(s))

print("Cipher: "+(encrypt(text,s)))
