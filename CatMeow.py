ans = input("How many times would you prefer me to meow? ")
def ncat(n):
    try:
        for cat in range(int(n)**2):
            print('Meow')
    except ValueError:
        print('Noew!')
ncat(ans)
