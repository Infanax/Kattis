import math
h, v = (int(s) for s in raw_input().split(' '))
vrad = (v * 3.1415926549)/180
print int(math.ceil(h/math.sin(vrad)))
