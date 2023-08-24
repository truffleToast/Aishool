# 최대값, 
my_list = []
try:
    while True:
        if len(my_list)<9:
            a = int(input("숫자를 입력하세요: "))
            my_list.append(a)
except EOFError:
    pass

b = max(my_list)
print("가장 큰 수는?", b)
print("그 수의 위치는?", my_list.index(b) + 1)

