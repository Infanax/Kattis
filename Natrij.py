from datetime import datetime
from datetime import timedelta
s1 = raw_input()
s2 = raw_input()
FMT = "%H:%M:%S"
if s1==s2:
    print "24:00:00"
else:

    tdelta = datetime.strptime(s2, FMT) - datetime.strptime(s1, FMT)
    if tdelta.days<0:
          tdelta = timedelta(days=0, seconds = tdelta.seconds, microseconds=0)

    if len(str(tdelta))==7:
         print '0' + str(tdelta)
    else:
         print str(tdelta)
