import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class InputOutputStream{

    public static void main(String[] args){
       

       try{

        InputStream inputstream = new FileInputStream("hello.txt");

        int length = inputstream.available();


        byte[] ch = new byte[length];


        inputstream.read(ch);

        System.out.println(new String(ch));

        String data = "hello world";

        OutputStream outputstream = new FileOutputStream("hi.txt");

        outputstream.write(data.getBytes());

        outputstream.close();


       }catch(IOException e){
        System.out.println("error: "+e);
       }

       
    }
}