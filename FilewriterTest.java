import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class FileWriterTest{

    public static void main(String[] args){
       

       try{
        FileWriter filewriter = new FileWriter("hello.txt");
        filewriter.write("hello");
        filewriter.close();

        FileReader filereader = new FileReader("hello.txt");
        
        int i;
        while((i=filereader.read()) != -1){
            System.out.print((char)i);
        }

        filereader.close();        

        
       }catch(IOException e){
        System.out.println("error: "+e);
       }

       
    }
}