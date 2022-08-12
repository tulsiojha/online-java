class Interfaces{

    public static void main(String[] args){
        
        Vehicle vehicle = new Vehicle("Black");
        System.out.println(vehicle.getColor());
    }

}


interface VehicleInterface{

    String getColor();
    String getBrand();


}

class Vehicle implements VehicleInterface{
    String color;
    // //constructor

    Vehicle(String color){
    }

    @Override
    public String getColor(){
        return this.color;
    }

    @Override
    public String getBrand(){
        return "BMW";
    }

}
