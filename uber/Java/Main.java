class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        //creamos  metodo constructor de objeto
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Yulieth Lopera";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "QJO159";
        car2.driver = "Juan Camargo";
        car2.passenger = 3;
        car2.printDataCar();
    }
}