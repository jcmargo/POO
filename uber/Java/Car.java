class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    //metodo constructor
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    //functions
    void printDataCar() {
        System.out.println("License: " + license + " Name Driver: "+ driver.name + " Passengers: " + passenger);
        
    }

    //*********getter and setter*********

    //passenger
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        this.passenger = passenger;

    }


    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    //license
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


    //driver
    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
