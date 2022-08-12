class Abastraction{

    public static void main(String[] args){
        
        

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.getColor());
        System.out.println(vehicle.getBrand());
        
    }

}


abstract class VehicleInterface{

    abstract String getColor();

    public String getBrand(){
        return "xyz";
    }
    // abstract String getBrand();
}



class Vehicle extends VehicleInterface{
    
    // //constructor
    Vehicle(){
        
    }

    @Override
    public String getColor(){
        return "abc";
    }

}
