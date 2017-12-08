n = input()
ida = 0
for i in range(0,n):
    x = input()
    ida = ida + 1
    z = raw_input()
    zz = z.split()
    for temp in zz:
        if(zz.count(temp)<2):
            print "Case #" + str(ida) + ": " + str(temp)
            break

    
