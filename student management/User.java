package onlinejava.syncing;

public class User {
	String name;
	String ID;
	String rollNo;
	
	User(){
		
	}
	
	
	User(String n, String i, String r){
		this.name = n;
		this.ID = i;
		this.rollNo = r;
	}
	
	
	@Override
	public String toString() {
		return "Name: "+this.name+" ID: "+this.ID+" RollNo: "+this.rollNo;
	}
}



