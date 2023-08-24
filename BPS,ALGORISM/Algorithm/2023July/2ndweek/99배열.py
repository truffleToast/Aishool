my_list = []
for i in range(9):
    a = list(map(int, input().split()))
    my_list.append(a)
## 이렇게 되면 이중 리스트가 만들어집니다. [[1,3,4,5,6], [3,123,5,5,6,7]...]]
maxl = 0 ## 최대값을 찾는 필드
maxRow= 0 # 최대값이 있는 행
maxColumn = 0 #  최대값이 있는 열
## my_list에 접근이 필요할 것
for i in range(9):
    for j in range(len(my_list[i])):
        ## 일단 각 리스트에서 최대값을 찾는 것이 필요
        if maxl < my_list[i][j]:
            maxl = my_list[i][j]
            maxRow = i
            maxColumn = j
print(maxl)
print(maxRow+1, maxColumn+1)











