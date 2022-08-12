import java.util.ArrayList;
import java.util.List;

class Array{

    public static void main(String[] args){
        ArrayList<Animal> bucket = new ArrayList<Animal>();

        bucket.add(new Animal("dog"));
        bucket.add(new Animal("cat"));
        
        
        try{
            System.out.println(bucket.get(2));
        }catch(Exception e){
            System.out.println("Invalid operation");
        }
        System.out.println(bucket.get(2));
        System.out.println("Success");

    }

}



class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}