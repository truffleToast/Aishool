A = int(input())
B = int(input())
C = int(input())
# 입력 완료
number = str(A*B*C)
for i in range(10):
    numct = number.count(str(i))
    print(numct)

