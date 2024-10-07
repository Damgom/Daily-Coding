count = [0] * (1000 + 1)

result = 0
for i in range(10):
    num = int(input())
    result += num
    count[num] += 1

print(result // 10)
print(count.index(max(count)))