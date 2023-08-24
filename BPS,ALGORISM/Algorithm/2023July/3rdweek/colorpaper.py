# 2563
my_colorPaper = []  # 색종이의 위치 , 색종이는 반드시 10 *10 의 형태
N = int(input())  #처음 입력 받기
for i in range(N):
    a = list(map(int, input().split()))  # 두개만 입력 받음. (x축 ,y축) 입력
    my_colorPaper.append(a)
# 이중 배열 리스트 완성
# 겹치면 빼야됨. 넓이를 더하되 위치가 겹치면 그 부분만 빼주면 좋을듯..?
answer = N*100
for i in range(len(my_colorPaper)-1): # list의 길이가 3이라면, list는
    for j in range(N-1):
        if (my_colorPaper[j][0]+10) > my_colorPaper[j+1][0]:
            width = abs(int(my_colorPaper[j+1][0]) - int(my_colorPaper[j][0]))
        else:
            width = 0
        if (my_colorPaper[j][1]+10) > my_colorPaper[j+1][1]:
            height = abs(int(my_colorPaper[j+1][1]) - int(my_colorPaper[j][1]))
        else:
            height = 0
        space = width * height
        answer -= space
print(answer)