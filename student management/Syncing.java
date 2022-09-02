package onlinejava.syncing;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.FileBody;
import org.apache.hc.client5.http.entity.mime.HttpMultipartMode;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpRequest;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.ClassicHttpResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.util.HashSet;
import java.util.Set;


import onlinejava.syncing.User;


public class Syncing {
	
	String folder = "C:\\Users\\Bikash\\Desktop\\data";
	List<String> files = new ArrayList<String>();
	
	
	Syncing(){
		
//		getFileList();
//		System.out.println(files);
//		System.out.println(getFileListFromServer());
//		

		
		
		
//		uploader();
		
//		System.out.println(getUploadList());
		
		
//		int[] arr = {1, 2, 3};
//					 0   1	2	
//		}
		
	}
	
	
		List<String> getUploadList(){
		List<String> uploadList = new ArrayList<String>();
		
		for(String file:files) {
			if(getFileListFromServer().indexOf(file) == -1) {
				uploadList.add(file);
			}
		}
		return uploadList;
	}
	

    void getFileList(){
        
        File[] files = new File(folder).listFiles();
        System.out.println(files);
        for(File file:files ){
            this.files.add(file.getName());
//            System.out.println(file.getName());
        }
    }
    
    void uploader() {
    	HttpClient client = HttpClientBuilder.create().build();
		
		//post, get, put, delete, patch
		
	    HttpPost post = new HttpPost("https://chattest.alwaysdata.net/upload.php");
	    
	    MultipartEntityBuilder builder = MultipartEntityBuilder.create();        
	    builder.setMode(HttpMultipartMode.EXTENDED);
	    
	    
	    for(String file:getUploadList()) {
	    	builder.addPart("file", new FileBody(new File(folder+"\\"+file)));
	    	
	    	post.setEntity(builder.build());
//	    	System.out.println(file);
	    	try {
	    		ClassicHttpResponse response = (ClassicHttpResponse)client.execute(post);
	  
	    		System.out.println(EntityUtils.toString(response.getEntity()));
	    	}catch(IOException | ParseException e) {
	    		System.out.println(e);
	    	}	
	    }
	    
    }
    
    
    JSONArray getFileListFromServer(){
    	HttpClient client = HttpClientBuilder.create().build();
		
		//post, get, put, delete, patch
		
	    HttpGet get = new HttpGet("https://chattest.alwaysdata.net/listfiles.php");
	    try {
	    	ClassicHttpResponse response = (ClassicHttpResponse)client.execute(get);
	 		JSONParser parser = new JSONParser();
    		JSONArray jsonArray = (JSONArray) parser.parse(EntityUtils.toString(response.getEntity()));
    		return jsonArray;
	    }catch(IOException | ParseException | org.json.simple.parser.ParseException e) {
    		System.out.println(e);
    	}
	    
	   return new JSONArray();
    }
    
    
    
	public static void main(String[] args) {
		
		Map<String,User> userColl = new HashMap<String,User>();
		
		
		userColl.put("hari",new User("hari","1","100"));
		userColl.put("hari1",new User("hari1","11","1001"));
		userColl.put("hari12",new User("hari12","111","1001"));
		userColl.put("hari13",new User("hari13","112","1001"));
		userColl.put("hari14",new User("hari14","113","1001"));
		
		
		

		
		
		
		try (Reader reader = new FileReader("C:\\Users\\Bikash\\Desktop\\some.json")) {
			
			Type mapType = new TypeToken<Map<String,User>>(){}.getType();
			
			Gson gson = new Gson();
			Map<String,User> data = gson.fromJson(reader, mapType);
			System.out.println(data);
			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
