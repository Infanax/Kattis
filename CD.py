while True:
    jck, jll = (int(s) for s in raw_input().split(' '))
    if(jck == 0 and jll==0): break;
    jack =set()
    for i in range(0, jck):
        jack.add(int(raw_input()))
        x = 0
    for i in range(0, jll):
        s = int(raw_input())
        if(s in jack):
            x = x+1
    print x
