def getc(seq):
    combinations = list()
    for i in range(0, len(seq)):
        for j in range(i+1, len(seq)):
            combinations.append([seq[i], seq[j]])
            combinations.append([seq[j], seq[i]])
    return combinations
acc = list()
out = ''
while True:
    try:
        acc.append(raw_input())
    except EOFError:
        out = '\n'.join(acc)
        break
x = out.split()
y = map(''.join, getc(x))
z = list(set(y))
n = sorted(z)
for man in n:
    print man
