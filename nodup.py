x = raw_input()
lista = x.split()
listb = set(lista)
if len(lista)==len(listb):
    print "yes"
else:
    print "no"

