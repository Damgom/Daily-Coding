yeondoo = input()
teamNum = int(input())
nameList = []

max = 0
maxName = ''
for _ in range(teamNum):     # 팀 이름 리스트로 만들기
  nameList.append(input())

nameList = sorted(nameList)

for name in nameList:
  teamname = name + yeondoo

  l = teamname.count("L")
  o = teamname.count("O")
  v = teamname.count("V")
  e = teamname.count("E")

  ans = ((l+o)*(l+v)*(l+e)*(o+v)*(o+e)*(v+e))%100

  if ans == 0:
    pass
  elif ans > max:
    max = ans
    maxName = name

if max == 0:
  print(nameList[0])
else:
  print(maxName)  