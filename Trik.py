def swap(a, b, lista):
    lista[a], lista[b] = lista[b], lista[a]
x = raw_input()
lista = [1, 0, 0]
for c in x:
    if c == 'A':
        swap(0, 1, lista)
    elif c == 'B':
        swap(1, 2, lista)
    else:
        swap(0, 2, lista)

print lista.index(1)+1
