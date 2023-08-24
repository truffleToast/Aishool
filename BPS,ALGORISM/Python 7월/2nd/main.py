# 세탁소 사장 동혁 2720
Test = int(input())
cng_lst = []
# 그냥 계산 편하게 하기 위해 최적화 하자 Coin은 센트 기준이므로  쿼터는 25센트 다임은 10센트 니켈은 5센트 페니는 1센트
for i in range(Test):
    Coin = int(input())
    Q = Coin // 25
    D = Coin % 25 // 10
    N = Coin % 25 % 10 // 5
    P = Coin % 25 % 10 % 5 // 1
    result = str(Q) + " " + str(D) + " " + str(N) + " " + str(P)
    cng_lst.append(result)
for cng in cng_lst:
    print(cng)







