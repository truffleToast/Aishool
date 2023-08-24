my_word=input().upper()
alpha_List=list(set(my_word)) # set은 집합형 자료 , 중복을 제거해 주나 순서가 없어 인덱싱이 불가능 하다.
## print(alpha_List)  # 한번 리스트를 확인해보자
# 그래서 list로 바꿔 중복을 제거한 리스트를 만들고 접근할 수 있게한다.
cnt_List=[] #Count를 세는 리스트를 만들어 빈 공간으로 만든다.
for a in alpha_List:
    cnt_List.append(my_word.count(a)) #my_word를 리스트로 바꾼 후 거기서 alpha_List(집합 리스트)의 alpha를 카운트한다.
     # 그 후 cnt_List에 차례차례 append한다. 여기서 list화 됫으므로 c_List의  값은 alpha_List의 각각의 갯수가 될것이다.
#print(cnt_List) #그래서 그걸 나타낸 리스트를 출력
## print(cnt_List.count(max(cnt_List)))
if cnt_List.count(max(cnt_List))==1: ## cnt_List에서 max(cnt_List)를 카운트 했을 때 값이 1이면
    print(alpha_List[cnt_List.index(max(cnt_List))])
else:
    print("?")