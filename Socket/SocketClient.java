import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class SocketClient{


    public SocketClient(){

       try{
        Socket socket = new Socket("185.31.40.87", 8100);
        System.out.println("Connected to : "+socket);

        OutputStream out = socket.getOutputStream();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

        Scanner sc = new Scanner(System.in);

        while(true){
            String data = sc.nextLine();
            bw.write(data+"\n");
            // bw.newLine();
            bw.flush();
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