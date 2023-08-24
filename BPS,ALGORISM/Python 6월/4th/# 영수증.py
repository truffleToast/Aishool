#recipt
X=int(input("영수증에 적힌 가격은?")) # x를 먼저 입력 받는다.

N=int(input("물건의 종류의 수")) # 그다음 N
my_cart=[]
for i in range(N):
    a,b = map(int, input().split())
    c=a*b
    my_cart.append(c)
if X == sum(my_cart):
    print("Yes")
else:
    print("NO")        



