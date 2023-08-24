# 2563
N = int(input())  #처음 입력 받기
Dohwaji = []
for i in range(10000):
    Dohwaji.append(0)  # 10 *10 배열처럼 만들수 잇음
for num in range(N):
    x, y = map(int, input().split())  # 두개만 입력 받음. (x축 ,y축) 입력
    xy = x*y
    cnt = 0
    while True:
        if cnt == 10:
            break
        for j in range(10):
            Dohwaji[xy] = 1
            xy += 1
        cnt += 1
print(Dohwaji.count(1))


