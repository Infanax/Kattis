col = 0
while True:
    try:
        x = raw_input()
        if(len(x)<1):
            print '\n'
            col = 0
        else:
            starcnt = x.count('*')
            starlist = ['.'] * len(x)
            for i in range(col, col + starcnt):
                starlist[i]='*'
            print (''.join(starlist))[::-1]
            col = col + starcnt

    except EOFError:
        break
