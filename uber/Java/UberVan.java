import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        
        if(passenger == 6){
            super.setPassenger(passenger);
        }else{
            System.out.println("UberVan needs 6 passengers assigned");
        }
    }
    
    
}