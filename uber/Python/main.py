from car import Car
from account import Account
from uberX import UberX
from user import User


if __name__ == '__main__':
    print('Hola mundo')
    
    #creamos objeto uberx
    uberX = UberX("THN852", Account("Yulieth Lopera", "1000888380"), "Mini", "Cooper")
    uberX.passenger = 4
    print(vars(uberX))
    print(vars(uberX.driver))

    print("----------------------")

    user = User("Juan Camargo", "1192792841")
    user.email = "juanc@gmail.com"
    user.password = "passwordlie"
    print(vars(user))