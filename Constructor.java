class Constructor{

    public static void main(String[] args){
        
    
        Vehicle vehicle = new Vehicle();
        // RoadVehicle roadVehicle = new RoadVehicle();

        // SeaVehicle seaVehicle = new SeaVehicle();
    


    }

}


class Vehicle{

    // fields or properties
    String color;
    String type;
    String brand = "bmw";
    String serialNo = "123";

    // //constructor

    Vehicle(){
        System.out.println("hello");
    }

    Vehicle(String color, String type){
       this.color = color;
       this.type = type;
       System.out.println("abcd");
    }

    Vehicle(String color, String type){
       this.color = color;
       this.type = type;
       System.out.println("abcd");
    }

    Vehicle(String color, String type, String brand, String serialNo){
       this.color = color;
       this.type = type;
       this.brand = brand;
       this.serialNo = serialNo; 
       System.out.println("hi");
    }


    String getColor(){
        return this.color;
    }

    String getBrand(){
        return this.brand;
    }

    void setColor(String color){
        this.color = color;
    }

}


// class RoadVehicle extends Vehicle{

//     String numberOfWheels;

//     RoadVehicle(){
//        System.out.println(this.serialNo); 
//     }

// }

// class SeaVehicle extends Vehicle{

//     SeaVehicle(){
//         System.out.println(this.serialNo);
//     }
// }