#1259 팰린드롬
Answer='' # 다 끝나고 출력하기 위해서 미리 빈 리스트
while True:
    nums = list(input())
    if nums == ['0']:
        break
    else:
        while True:
            if len(nums) <= 1:
                myLst.append('yes')
                break
            if nums[0] == nums[-1]:
                del nums[0]
                del nums[-1]
            else:
                myLst.append('no')
                break
for a in myLst:
    print(a)







