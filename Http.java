import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

class Http{
    
    static final String USER_AGENT = "Mozilla/5.0";
    
    public static void main(String[] args){

        String GET_URL = "https://raw.githubusercontent.com/tulsiojha/data/master/ECG.zip";
        
       try{

        URL url = new URL(GET_URL);



        HttpURLConnection con = (HttpURLConnection) url.openConnection();


        con.setRequestMethod("GET");


		con.setRequestProperty("User-Agent", USER_AGENT);




		int responseCode = con.getResponseCode();

		System.out.println("GET Response Code :: " + responseCode);


        if (responseCode == HttpURLConnection.HTTP_OK) { // success

			InputStream in = con.getInputStream();

            OutputStream out = new FileOutputStream("ecg.png");

            byte[] buffer=new byte[10];

            int data;
            while( ( data=in.read(buffer) ) >= 0){
                out.write(buffer, 0, data);
            }
            out.close();
			// System.out.println(response.toString());
		} else {
			// System.out.println("GET request not worked");
		}
        
        // System.out.println(con);
       }catch(IOException e){
        System.out.println("error: "+e);
       }

       
    }
}