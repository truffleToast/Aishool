# 할무니
# 1=1 ABC =2 DEF =3 GHI = 4 JKL = 5 MNO =6 PQRS =7 TUV =8 WXYZ = 9 0은 OPTION
number = input()
time = 0
gm_list = [[2, 'A', 'B', 'C'], [3, 'D', 'E', 'F'], [4, 'G', 'H', 'I'],
           [5, 'J', 'K', 'L'], [6, 'M', 'N', 'O'], [7, 'P', 'Q', 'R', 'S'], [8, 'T', 'U', 'V'], [9, 'W', 'X', 'Y', 'Z']]
for num in number:
    for i in range(len(gm_list)):
        if num == '1':
            time += 2
            break
        if num in gm_list[i]:
            time += gm_list[i][0] + 1
            break  # 다음 num으로 넘기기
print(time)







