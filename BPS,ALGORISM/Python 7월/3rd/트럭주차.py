a, b, c = map(int, input().split())
car_x = [0]*100
car_fee = 0
for i in range(3):
    car_in, car_out = map(int, input().split())
    for j in range(car_in, car_out):
        car_x[j]+=1
for car in car_x:
    if car == 3:
        car_fee += c*3
    elif car == 2:
        car_fee += b*2
    elif car == 1:
        car_fee += a
print(car_fee)