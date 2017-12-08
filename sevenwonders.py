x = raw_input()
tcnt = x.count('T')
ccnt = x.count('C')
gcnt = x.count('G')
def mini(a, b, c):
        imax = a
        if (b < imax) and (b < c):
            imax = b
        elif (c < imax):
            imax = c
        return imax
print (gcnt**2) + (ccnt**2) + (tcnt**2) + (mini(tcnt, ccnt, gcnt)*7)
