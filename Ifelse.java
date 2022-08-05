public class Ifelse{
    
    public static void main(String[] args){
        
        Hello h = new Hello();

    }
}

class Hello{

    Hello(){

        int i = 10;
        int j = 20;

        String name = "ram";
        double abc = 1.99;

      if(name == "ram"){
        System.out.println(true);
      }
      else{
        System.out.println(false);
      }


      switch(name){

        case "ram":
            System.out.println(true);
            break;
        default:
            System.out.println(false);
            
      }


    } 
}
