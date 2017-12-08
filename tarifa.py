x = input()
n = input()
sumx=0
sumy=0
for i in range (0, n):
    z = input()
    sumx = sumx + z
    sumy = sumy + x
sumz = sumy-sumx+x
print sumz
