class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        //creamos  metodo constructor de objeto
        UberX car = new UberX("AMQ123", new Account("Yulieth Lopera", "ANT158"), "Mini", "Cooper");
        car.setPassenger(4);
        car.printDataCar();

        UberVan uberVan = new UberVan("UHG654", new Account("Juan Camargo", "1192792841"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();


    }
}