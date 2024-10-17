from math import gcd
from functools import reduce

def lcm(a, b):
    return a * b // gcd(a, b)

N = int(input())
numbers = list(map(int, input().split()))

result = reduce(lcm, numbers)
print(result)