N = int(input())
my_list = []
for i in range(N):
    x, y = map(int, input().split())
    my_list.append((x, y))
# 이중리스트 완성
my_list2 = sorted(my_list, key=lambda x: (x[0], x[1]))
for a in my_list2:
    print(*a)