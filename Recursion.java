public class Recursion{
    
    public static void main(String[] args){
        
        Hello h = new Hello();

    }
}

class Hello{

    Hello(){
        this.sum(10);
    }

    void sum(int num){
        System.out.println(num);
        
        if(num>20){
            return;
        }cd 

        this.sum(num+1);
    }

}
