package onlinejava.syncing;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class FileHandler {	
	String path = "";
	
	FileHandler(String path){
		this.path = path;
	}
	
	
	void writeFile(Map<String,User> data) {
		try (Writer writer = new FileWriter(path)) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
		    gson.toJson(data, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	Map<String,User> readFile(){
		try(Reader reader = new FileReader(path);){
					
			Type mapType = new TypeToken<Map<String,User>>(){}.getType();
			
			Gson gson = new Gson();
			Map<String,User> data = gson.fromJson(reader, mapType);
			
			return data;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	void update(Map<String,User> data) {
		this.writeFile(data);
	}
	
	void delete(Map<String,User> data) {
		this.writeFile(data);
	}
}
