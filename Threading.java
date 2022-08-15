// import java.io.Thread;

class Threading{

    public static void main(String[] args){

        // new TestThread(); 
        // new TestRunnable();  
        new TestRunnable2();  
    }
}


class TestThread  extends Thread{

    TestThread(){
        Thread thread = new Thread(this);
        thread.start();

        int i = 0;

        while(i<100){
            System.out.println("Main thread: "+i);
            i++;
        }
        System.out.println("Reached");
        
    }

     public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Second thread: "+i);
            i++;
        }
    }
}



class TestRunnable implements Runnable{

    TestRunnable(){
        Thread thread = new Thread(this);
        thread.start();

        int i = 0;

        while(i<100){
            System.out.println("Main thread: "+i);
            i++;
        }
        System.out.println("Reached");
        
    }

     public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Second thread: "+i);
            i++;
        }
    }
}




class TestRunnable2{

    TestRunnable2(){
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                int i = 0;
                while(i<100){
                    System.out.println("Second thread: "+i);
                    i++;
                }
            }
        });
        thread.start();

        int i = 0;

        while(i<100){
            System.out.println("Main thread: "+i);
            i++;
        }
        System.out.println("Reached");
        
    }
}