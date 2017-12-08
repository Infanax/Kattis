n = input()
abc = set()
a = 0
winlist  = []
for i in range (0, n):
    if a==12:
        break
    string = raw_input()
    x, y = string.split()
    if x in abc:
        continue
    else:
        print string
        abc.add(x)
        a = a + 1

