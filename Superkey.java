class Superkeyword{

    public static void main(String[] args){
        
    
        RoadVehicle roadVehicle = new RoadVehicle("black","bike","bmw","1111","2");
        System.out.println(roadVehicle.getColor());
    
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

    }

    Vehicle(String color, String type, String brand, String serialNo){
       this.color = color;
       this.type = type;
       this.brand = brand;
       this.serialNo = serialNo; 
    }


    String getColor(){
        
        return "Parent: "+this.color;
    }

    String getBrand(){
        return this.brand;
    }

    void setColor(String color){
        this.color = color;
    }


    public String toString(){
        return "Color: "+this.color+" Type: "+this.type+" Brand: "+this.brand+" SerialNo: "+this.serialNo;
    }

}


class RoadVehicle extends Vehicle{

    String numberOfWheels;

    RoadVehicle(String color, String type, String brand, String serialNo,String numberOfWheels){
        super(color, type, brand, serialNo);
        this.numberOfWheels = numberOfWheels;
    }


    @Override
    public String toString(){
        return super.toString()+ " Number of wheels: "+this.numberOfWheels;
    }

    @Override
    public String getColor(){
        return "Hello word"+super.getColor();
    }

}
