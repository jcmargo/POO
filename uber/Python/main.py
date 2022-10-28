from car import Car
from account import Account


if __name__ == '__main__':
    print('Hola mundo')
    
    #creamos objeto
    car = Car("AMS958", Account("Yulieth Lopera", "1000888380"))
    print(vars(car))
    print("-------------")
    print(vars(car.driver))
