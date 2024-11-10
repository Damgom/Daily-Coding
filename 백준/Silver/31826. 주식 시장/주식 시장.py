import sys
from collections import defaultdict

N = int(sys.stdin.readline())
dict = defaultdict(int)
price = 10000
for _ in range(N):
    p, x, f = map(int, sys.stdin.readline().split())
    if dict[p] == 0:
        dict[p] = x * f
    else:
        if dict[p] * f > 0:
            dict[p] += (x * f)
        else:
            dict[p] += (x * f)
            price = p
print(price)