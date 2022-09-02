package onlinejava.syncing;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	
	String path = "C:\\\\Users\\\\Bikash\\\\Desktop\\\\some.json";
	
	
	Main(){
		FileHandler fileHandler = new FileHandler(path);
		
//		fileHandler.writeFile(createData());
		
		System.out.println(fileHandler.readFile());
		
		Map<String,User> users = fileHandler.readFile();
		
		
		//update
//		User hari = users.get("hari");
//		hari.name = "sita";
		
//		users.put("hari", hari);
//		
//		fileHandler.update(users);

		
		//delete
		users.remove("hari1");
		fileHandler.delete(users);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	
	Map<String,User> createData(){
		
		Map<String,User> userColl = new HashMap<String,User>();
		
		userColl.put("hari",new User("hari","1","100"));
		userColl.put("hari1",new User("hari1","11","1001"));
		userColl.put("hari12",new User("hari12","111","1001"));
		userColl.put("hari13",new User("hari13","112","1001"));
		userColl.put("hari14",new User("hari14","113","1001"));
		
		return userColl;
	}

}
