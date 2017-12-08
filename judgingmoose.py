l, r = (int(s) for s in raw_input().split(' '))
if l==r and l==0:
    print "Not a moose"
elif l==r:
    print "Even " + str(l+r)
else:
    print "Odd " + str(max(l,r)*2)
