factor_list = []
number_list = []
while True:
    # 숫자를 -1을 받을때까지 입력받음.
    N = int(input())
    if N == -1:
        break
    number_list.append(N)
# 여기까지 실행시에 number_list에는 각각의 값이 담기게 될것
for i in range(len(number_list)): # number_list에 있는 모든 인덱스에 접근
    for j in range(1,int(number_list[i]/2) + 1): # 동적 프로그래밍
        if (number_list[i] % j) == 0:
            factor_list.append(j)
        if sum(factor_list) == number_list[i]:
            print(f'{number_list[i]}= "+ ".{str(join(factor_list))}')
        else:
            print(f'{number_list[i]} is not Perfect.')