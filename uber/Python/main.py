from car import Car


if __name__ == '__main__':
    print('Hola mundo')
    
    #creamos objeto
    car = Car()
    car.license = "KJU135"
    car.driver = "Yulieth Lopera"
    car.passenger = 4
    print(vars(car))

    car2 = Car()
    car2.license = "YHN864"
    car2.driver = "Juan Camargo"
    car2.passenger = 4
    print(vars(car2))
