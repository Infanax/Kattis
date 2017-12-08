while True:
    n, m = (int(s) for s in raw_input().split(' '))
    if(n==0 and m==0): break
    headrad = list()
    knight = list()
    b = n
    gold = 0
    for i in range (0, n):
        headrad.append(int(raw_input()))
    for i in range (0, m):
        x = int(raw_input())
        knight.append(x)
    headrad.sort()
    knight.sort()
  #  print headrad
   # print knight
    ind = 0
    for i in range (0, n):
        curr = headrad[i]
        
        for j in range(ind, m):
            if(knight[j]>=headrad[i]):
                gold = gold + knight[j]
                b = b-1
                knight[j]=0
                ind = j;
                break
        if(b<0 or b==0): break
    if((b>0) or n>m): print "Loowater is doomed!"
    else: print gold

