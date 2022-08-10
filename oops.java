class OOPS{

    public static void main(String[] args){
        

        Vehicle vehicle = new Vehicle("black", "bmw");
       
        System.out.println();
    }

}


class Vehicle{

    // fields or properties
    String color;
    String brand;
    private String serialNo = "123";


    //constructor
    Vehicle(String color, String brand){
       this.color = color;
       this.brand = brand;
    }


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