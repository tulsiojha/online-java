public class Test{
    
    public static void main(String[] args){
        
        Hello h = new Hello();

    }
}


class Hello{

    Hello(){
    
        this.upper("Ramesh");
    } 


    void upper(String name){

        char[] tempName = name.toCharArray();
        for(int i = 0; i <= name.length()-1; i++){

            if((char)((byte)name.charAt(i)) > 96 && (char)((byte)name.charAt(i)) < 123){
                tempName[i] = (char)((byte)name.charAt(i)-32);
            }
            
        }

        System.out.println(tempName);
    }

}
