x = input()
xbin = bin(x)[2:]
print int(xbin[::-1], 2)
