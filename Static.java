class Static{

    public static void main(String[] args){
        

        Vehicle vehicle = new Vehicle("black", "bmw");
       
        System.out.println(Vehicle.square(5));
        System.out.println(Vehicle.serialNo);
    }

}


class Vehicle{

    // fields or properties
    String color;
    String brand;
    static String serialNo = "123";


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

    static int square(int x){
        return x*x;
    }

}