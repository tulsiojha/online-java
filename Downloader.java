package onlinejava;

// import android.net.Uri;
// Uri uri = Uri.parse("http://example.com/foo/bar/42?param=true");
// String token = uri.getLastPathSegment();
import java.net.URLDecoder;
import java.util.Map;
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

public class Downloader{
    
    String stringUrl = "";

    public Downloader(String stringUrl){
        this.stringUrl = stringUrl;
    }

    public void start(){
        if(this.stringUrl != null && !this.stringUrl.isEmpty()){
            try{
                URL url = new URL(this.stringUrl);

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("GET");

                if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){

                    InputStream inputstream = connection.getInputStream();

                    OutputStream outputstream = new FileOutputStream(getFilename(url));

                    byte buffer[] = new byte[1024*10*10];

                    int data;

                    int totalSize = connection.getContentLength();
                    int progress = 0;


                    while((data = inputstream.read(buffer)) != -1){
                        outputstream.write(buffer, 0, data);

                        progress = progress + data;

                        System.out.print("progress: "+ ((progress*100)/totalSize)+ "%");
                        System.out.print("\r");
                    }


                    outputstream.close();
                    inputstream.close();


                }else{
                    System.out.println("Error: Connection could not be established.");    
                }

            }catch(IOException e){
                
                System.out.println("Error: "+e);    
            }

        }else{
            System.out.println("Url is invalid.");
        }
    }

    void stop(){

    }


    String getFilename(URL url){
        String tempurl = URLDecoder.decode(url.toString());
        int index = tempurl.lastIndexOf("/")+1;
        String filename = tempurl.substring(index);
        return filename;
    }
}