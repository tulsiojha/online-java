public class While{
    
    public static void main(String[] args){
        
        Hello h = new Hello();

    }
}

class Hello{

    Hello(){

        //for
        char myarray[] = {'a', 'b', 'c'}; 

        int i = 0;

        while(i<3){
            
            System.out.println(myarray[i]);
            
            i++;
        }

    } 
}
