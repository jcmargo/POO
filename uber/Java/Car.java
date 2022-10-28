class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    //metodo constructor
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    //functions
    void printDataCar() {
        System.out.println("License: " + license + " Name Driver: "+ driver.name);
        
    }
}
