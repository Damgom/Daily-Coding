import sys

Q = int(sys.stdin.readline())
for _ in range(Q):
    a, b = map(int, sys.stdin.readline().split())
    print(1 if b >= 2*a and b % a == 0 else 0)