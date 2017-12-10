import math
b, k, g = (int(s) for s in raw_input().split())
groups = int(k/g)
a = 0
'''if b%groups==1.0:
    print (int(math.ceil(b/groups))-1)
else:
    print (int(math.ceil(b/groups)))
'''
while b>1:
    b = b - groups
    a = a+1
print a
