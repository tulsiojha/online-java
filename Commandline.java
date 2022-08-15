public class Commandline{


    public static void main(String[] args){
        int value = Integer.parseInt(args[1]);
        switch(value){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
    }
}