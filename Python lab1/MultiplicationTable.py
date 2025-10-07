def multiplication_for(num):
    for i in range(1, 11):
        result = num * i
        print(f"{num} x {i} = {result}")

def multiplication_while(num):
    i = 1
    while i <= 10:
        result = num * i
        print(f"{num} x {i} = {result}")
        i += 1

def multiplication_do_while(num):
    i = 1
    while True:
        result = num * i
        print(f"{num} x {i} = {result}")
        i += 1
        if i > 10:
            break

multiplication_while(2)