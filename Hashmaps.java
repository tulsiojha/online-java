import java.util.HashMap;

class HashMaps{

    public static void main(String[] args){
        HashMap<Animal, Animal> bucket = new HashMap<Animal, Animal>();

        Animal name = new Animal("name");
        bucket.put(name,new Animal("abc"));
        // bucket.put("age","25");
        // bucket.put();
        
        System.out.println(bucket.get(name));
    }

}



class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

    // public String toString(){
    //     return this.name;
    // }
}