
message = "BTW I use Arch"
dob = 1998
pi = 3.14159

print(message)
print(dob)
print(pi)

print(type(pi))
print(len(message))

print("without the int funtion",2*dob +len(message)/pi)
print("with the int funtion",int(2*dob +len(message)/pi))


#inc & dec
dob = dob +1
pi +=1
pi -=1

print(dob)
print(pi)

### INPUT ###
n = input("enter you name: ") ## the output is given as a str
print(n," hello")
print(type(n))

n = input("enter dob: ")   ## the output is given as a str
print(n)
print(type(n))
print("after conveting to int")
print(type(int(n)))
print(n)
