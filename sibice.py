n, w, h = (int(s) for s in raw_input().split(' '))
x = ((w**2) + (h**2)) ** 0.5
for i in range(0, n):
    if(input()<=x):
        print "DA"
    else:
        print "NE"
