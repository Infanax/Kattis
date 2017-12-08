while True:
   n = int(raw_input())
   if n==0:
       break
   recsum=0
   sumboi=0
   for i in range (0, n):
       strx = raw_input()
       sumboi = sum(strx.count(x) for x in ("aa", "ee", "ii", "oo", "uu", "yy"))
       if sumboi>=recsum:
           rec = strx
           recsum = sumboi
   print rec

