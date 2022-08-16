import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import onlinejava.Downloader;

class Http{
    
    static final String USER_AGENT = "Mozilla/5.0";
		// con.setRequestProperty("User-Agent", USER_AGENT);
// "https://raw.githubusercontent.com/tulsiojha/data/master/KMSpico%20v.10.2.0.zip"
    
    public static void main(String[] args){
        try{
            String url = args[0];
            Downloader downloader = new Downloader(url);
            downloader.start();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please provide url.");
        }catch(Exception e){
            System.out.println("Something went wrong. "+ e);
        }
    }
}


