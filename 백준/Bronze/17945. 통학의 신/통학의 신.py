import sys

A, B = map(int, sys.stdin.readline().split())
li = []
for i in range(-1000, 10001):
    if i * (2 * A - i) == B:
        li = list({-i, -(2 * A - i)})
print(*sorted(li))