x = raw_input()[::-1]
a, b = (int(s) for s in x.split(' '))
print max(a, b)
