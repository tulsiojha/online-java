class InterfaceTwo{

    public static void main(String[] args){
        
        VehicleInterface vehicleInterface = new VehicleInterface(){
            @Override
            public String getColor(){
                return "abc";
            }
        };

        Vehicle vehicle = new Vehicle(vehicleInterface);
        
        System.out.println(vehicle.test());
    }

}


interface VehicleInterface{
    String getColor();
    
}



class Vehicle{
    
    // //constructor
    VehicleInterface vehicleInterface;

    Vehicle(VehicleInterface vehicleInterface){
        this.vehicleInterface = vehicleInterface;
    }


    public String test(){
        return this.vehicleInterface.getColor();
    }

}
