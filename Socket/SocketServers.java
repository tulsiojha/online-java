import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class SocketServers{


    public SocketServers(){

       try{
         ServerSocket ss = new ServerSocket(1000);


        Socket socket = ss.accept();
        System.out.println("Client connected: "+socket);

        InputStream in = socket.getInputStream();

        StringBuilder sb = new StringBuilder();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String read;
        System.out.println("hello");
        // System.out.println(br.readLine());
        while (reader.ready()) {

            System.out.println(reader.readLine());
        }
        in.close();

       }catch(IOException e){
        System.out.println("Error: "+e);
       }

    }

    public static void main(String[] args){

        SocketServers socketServers = new SocketServers();
    }

}