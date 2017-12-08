import random
x, p =(s for s in raw_input().split(' '))
count = 0
for i in range(0,1000):
    r = random.uniform(0,100)
    if(r<=p):count = count + 1 
if(count>=500):
    print float((count*2) - 1000)
else:
    print "0.0"


