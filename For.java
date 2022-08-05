public class For{
    
    public static void main(String[] args){
        
        Hello h = new Hello();

    }
}

class Hello{

    Hello(){

        //for
        char myarray[] = {'a', 'b', 'c'}; 
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println(myarray[i]);    
        }

        
        //foreach
        
        for(char abc:myarray){
            System.out.println(abc);
        }
        

    } 
}
