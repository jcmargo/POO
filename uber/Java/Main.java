class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        //creamos  metodo constructor de objeto
        Car car = new Car("AMQ123", new Account("Yulieth Lopera", "ANT158"));
        car.setPassenger(4);
        car.printDataCar();

        Car car2 = new Car("QJO159", new Account("Juan Camargo", "THS157"));
        //car2.passenger = 3;
        car2.printDataCar();
    }
}