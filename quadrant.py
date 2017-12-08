c1 = input()
c2 = input()
b1 = True
b2 = True
if(c1>0): b1 = True
else: b1= False
if(c2>0): b2 = True
else: b2 = False
if (b1 and b2): print "1"
elif (b1 and (not b2)): print "4"
elif ((not b1) and b2): print "2"
else: print "3"
