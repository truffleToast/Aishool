# 초기상태 4개 , 사각형 1개
# 늘어나는양 :기존 사각형 개수(늘어날 점) *4 + 기존 사각형 갯수(가운데점) - 겹치는 점(기존 4각형의 개수)
N = int(input())
before = 2
for i in range(1,N):
    before += before-1
print((before*(before-1))**2)
# 규칙으로 발견함
# 2+1 의제곱 3+2의 제곱 5+4의 제곱 9+8의 제곱 17+16의 제곱 33+32의 제곱

N, K = map(int, input().split())
gachi_lst = []
bag = []
for i in range(N):
    W, Y = map(int, input().split())
    gachi_lst.append(W, Y)

