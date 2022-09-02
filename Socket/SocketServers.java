import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedOutputStream;
import java.text.SimpleDateFormat;
import java.net.InetAddress;

class SocketServers{


    public SocketServers(){

       try{
        InetAddress inet = InetAddress.getByName("185.31.40.87");
         ServerSocket ss = new ServerSocket(1000, 50, inet);
        System.out.println("Server started: "+ss);


        Socket socket = ss.accept();
        System.out.println("Client connected: "+socket);

        // OutputStream out = socket.getOutputStream();
    

        // InputStream in = socket.getInputStream();

        // // StringBuilder sb = new StringBuilder();

        // BufferedReader br = new BufferedReader(new InputStreamReader(in));
        // String data;
        // while((data = br.readLine()) != null){
        //     System.out.println(data);
        // }

        OutputStream out = socket.getOutputStream();
        
        SimpleDateFormat format = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:Ss z");

       String res = "HTTP/1.0 200 OK\n"
         + "Server: HTTP server/0.1\n"
        //  + "Date: "+format.format(new java.util.Date())+"\n"; 
            + "Content-type: text/html; charset=UTF-8\n"
         + "Content-Length: 28\n\n"
         + "<html><body>Hello world</body></html>";
        //  for(int x=0; x<1000000; x++){

        //  }
        out.write(res.getBytes());

        out.flush();
        out.close();

        while(true){

        }

       }catch(IOException e){
        System.out.println("Error: "+e);
       }

    }

    public static void main(String[] args){

        SocketServers socketServers = new SocketServers();
    }

}