##��� 1546
N=int(input())
grade=list(map(float ,input("���ڸ� �Է��ϼ��� , �� �������� �з��ϰ� ���������� ����").split()))
maG=max(grade)
new_sum=(sum(grade)) *100/maG
answer=new_sum/len(grade)
print(answer)

N = int(input())
grade = list(map(float, input("���ڸ� �Է��ϼ���, �� �������� �з��ϰ� ���������� ����").split()))
maG = max(grade)
new_sum = (sum(grade) / maG) * 100
answer = new_sum / len(grade)
print(answer)