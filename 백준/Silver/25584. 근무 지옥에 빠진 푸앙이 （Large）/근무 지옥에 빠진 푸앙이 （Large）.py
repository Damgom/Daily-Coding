def main():
    dict = {}
    weekend = int(input())

    for n in range(weekend):
        for m in range(4):
            names = input().split()

            for name in names:
                if name == "-":
                    continue
                if m == 0 or m == 2:
                    workTime = 4
                elif m == 1:
                    workTime = 6
                else:
                    workTime = 10

                if name not in dict:
                    dict[name] = workTime
                else:
                    dict[name] += workTime

    if not dict:
        print("Yes")
        return

    maxTime = max(dict.values())
    minTime = min(dict.values())

    if maxTime - minTime > 12:
        print("No")
    else:
        print("Yes")


if __name__ == "__main__":
    main()