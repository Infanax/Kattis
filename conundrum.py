x = list(raw_input())
a = 0
for i in range(0, len(x)):
    if((i%3==0 and x[i]!='P') or (i%3==1 and x[i]!='E') or (i%3==2 and x[i]!='R')):
        a = a + 1
print a

