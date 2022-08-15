import java.util.HashMap;


enum StaffTypes{
    TEACHER,
    INCHARE,
    PRINCIPAL,
    ABC
}


class Enums{

    public static void main(String[] args){
        StaffTypes s = StaffTypes.ABC;
        doSomething(s);
    }


    static void doSomething(StaffTypes s){
        switch(s){
            case TEACHER:
                System.out.println("Teacher");
                break;
            case INCHARE:
                System.out.println("Incharge");
                break;
            case PRINCIPAL:
                System.out.println("Principal");
                break;
            case ABC:
                System.out.println("abc");
                break;
            default:
                System.out.println("invalid");

        }
    }

}