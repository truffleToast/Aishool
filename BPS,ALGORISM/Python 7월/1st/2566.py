# 2566 list maximum , index
my_list = []
for i in range(9):
    numbers = list(map(int, input().split()))
    my_list.append(numbers)
# 이단계 까지 오면 일단 절반은 한거, 이차원 배열이 완성 되어 있음. 전혀 아님 더 해야됨
mxl_list = [] #
for i in range(len(my_list)):
    mxl = max(my_list[i])  # 각 리스트의 최대값 -> my_list[i]= numbers
    mxl_list.append(mxl)
# 각각의 값을 List에 넣어서 최대값을 비교해 보자
real_mxl = max(mxl_list)  # 첫째 구해야 할 값
# for i in range(9):
#     if real_mxl in mxl_list[i]:
#         maxRow = i
#         break
# for j in range(9):
#     if real_mxl == my_list[maxRow][j]:
#         maxColumn = j
#         break
#  주석 처리된 것이 두번째 접근
max_row = mxl_list.index(real_mxl)
max_col = my_list[max_row].index(real_mxl)
print(real_mxl)
print(max_row+1, max_col+1)













