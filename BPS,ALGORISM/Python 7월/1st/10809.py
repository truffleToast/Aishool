# find Alphabet
S = list(input().lower())  # 받는 즉시 리스트가 될것 그렇게 된다면 banana = [b, a, n, a, n, a] 집합으로 바꾸면 ban 만 남는다. 그 때
zibHap_S = list(set(S))  # set으로 바꾼것을 리스트로 바꾸게되면 순서가 다시 생긴다. 중복이 제거 되고 순서가 생긴 모습.
zibHap_S.sort()  # 반드시 [a,b,c]
soonsuo = []  # 순서를 적는 리스트
my_AsciiS = []  # 혹시 몰라 만든 아스키 코드 담는 칸
for char in zibHap_S:
    for i in range(len(S)):
        if char == S[i]: # 집합이기에 한번만 실행  ==
            soonsuo.append(i)
            break # 이러면 각 문자가 어디에 있는지 알수 있음.
i = 0
for k in range(26):  # 어차피 알파벳은 26개임
    if chr(k+97) in S:  # chr 은 숫자를 아스키 코드로 바꾸는 방법 , 아스키 코드에서는 소문자 a가 97이므로 , 대문자로도 똑같이 할수잇음 그때는 65를 더하자(S에 Upper를 적용)
        print(f'{soonsuo[i]}', end=' ')
        i += 1 # 변환한 알파벳이 내가 입력한 데이터에 잇는경우 i를 1씩 더해가며 해결 이중 for 문으로도 풀 수 있을 것이나 더 복잡해 질거 같음.
        if i >= len(soonsuo):
            continue
    if chr(k+97) not in S:
        print(f'{-1}', end=' ')







