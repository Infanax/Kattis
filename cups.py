n = input()
abc = list()
boola = True
for i in range(0, n):
    x, y = raw_input().split()
    try:
        z = int(x)
        boola = True
    except ValueError:
        z = int(y)
        boola = False
    if boola:
        abc.append((z/2, y))
    else:
        abc.append((z, x))
sortedabc = sorted(abc, key = lambda tup:tup[0])
for b in sortedabc:
    print b[1]
