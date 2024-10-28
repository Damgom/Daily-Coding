N = int(input())
V = list(map(int, input().split()))

cur_speed = 0
answer = 0

for i in range(N - 1, -1, -1):
    if V[i] > cur_speed:
        cur_speed += 1
    else:
        cur_speed = V[i]

    answer += cur_speed

print(answer)