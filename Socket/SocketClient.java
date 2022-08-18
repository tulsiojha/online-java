import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

class SocketClient{


    public SocketClient(){

       try{
        Socket socket = new Socket("192.168.1.82", 1000);
        System.out.println("Connected to : "+socket);

        OutputStream out = socket.getOutputStream();

        Scanner sc = new Scanner(System.in);

        while(true){
            String data = sc.nextLine();
            out.write(data.getBytes());
        }

        // out.close();
       }catch(IOException e){
        System.out.println("Error: "+e);
       }

    }

    public static void main(String[] args){

        SocketClient SocketClient = new SocketClient();
    }

}