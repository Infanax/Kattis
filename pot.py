n = input()
sumx = 0
for i in range (0, n):
    x = input()
    p = x % 10
    z = int(x/10)
    sumx = sumx + z**p
print sumx
