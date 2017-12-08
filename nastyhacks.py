n = input()
for i in range(0, n):
    r, e ,c = (int(s) for s in raw_input().split(' '))
    diff = e-r
    profit = diff-c
    if profit<0:
        print "do not advertise"
    elif profit==0:
        print "does not matter"
    else:
        print "advertise"

