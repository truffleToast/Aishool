#�ٱ��� ������(10811)
N,M=map(int, input().split()) # N,M �ޱ�
my_list=[] #�� ����Ʈ����
for i in range (0,N):
    my_list.append(i+1) # 0~N�� �ε��� ���� �Է�
for i in range(M):
    i, j =map(int,input().split())
    start=i-1 #�ε����� 0���� �����ϴϱ� �ε����� Ȱ���ϱ� ���ؼ��� 1�� �������
    end=j-1
    while (start<end): #�ٲٴ� ����(start�� end�� �ε�����(����))
        temp=my_list[start] #temp�� my_list[start]�� �ֱ�
        my_list[start]=my_list[end]
        my_list[end]=temp
        start+=1
        end-=1
for i in range(N):
    print(my_list[i],end=' ')

        

    



