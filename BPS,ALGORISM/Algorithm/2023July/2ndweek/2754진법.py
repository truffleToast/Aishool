# 못푼 문제 거꾸로 바꾸는걸 생각못햇다.
N, B = input().split()
N = ''.join(reversed(N)) #N을 거꾸로 입력해서 조인하여 문자열로 바꾸기
B = int(B) # B를 int로 변환

number = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ' # 저는 딕셔너리로 해서 하나하나씩 
                                                # 접근해서 햇다가 코드가 개더러워서 지움
result = 0
for i in range(len(N)-1, -1 , -1): # 시작 위치 입력받은 숫자의 길이-1 부터 0까지 줄어가면서
    result += number.index(N[i]) * (B**i)
print(result)
