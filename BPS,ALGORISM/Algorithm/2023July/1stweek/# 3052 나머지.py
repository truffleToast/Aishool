# 3052 ������
my_list=[] #�� ����Ʈ �����
for i in range (10):
    N=int(input())% 42 # ���ٿ� �ϳ��� �޾Ƽ� �ٷ� ������ȭ
    my_list.append(N)
cnt=0 # ������ ���� ���� ����
for i in range(10):
    for j in range(10):
        if i<j:
            if (my_list[i]==my_list[j]):
                cnt+=1
                break
print(10-cnt)




        


