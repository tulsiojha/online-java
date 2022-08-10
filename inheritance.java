class Inheritance{

    public static void main(String[] args){
        

        // Parent parent = new Parent();
       
        // System.out.println();

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.color = "black";
        roadVehicle.type = "bike";
        roadVehicle.brand = "abc";
        roadVehicle.numberOfWheels = "2";

        roadVehicle.detail();

        SeaVehicle seaVehicle = new SeaVehicle();
        seaVehicle.color = "white";
        seaVehicle.type = "boad";
        seaVehicle.brand = "zyz";

        seaVehicle.detail();
    }

}


class Vehicle{

    // fields or properties
    String color;
    String type;
    String brand = "bmw";
    String serialNo = "123";
    


    // //constructor


    //methods
    void accelerate(){

    }


    void braking(int a, int b){

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


class RoadVehicle extends Vehicle{

    String numberOfWheels;

    RoadVehicle(){
       System.out.println(this.serialNo); 
    }

    void detail(){
            System.out.println(this.color+" "+this.brand+" "+this.type+" "+this.numberOfWheels);
    }

}

class SeaVehicle extends Vehicle{

    SeaVehicle(){
        System.out.println(this.serialNo);
    }

    void detail(){
        System.out.println(this.color+" "+this.brand+" "+this.type);
    }
}