package ustbatchno3.ConstructorInjection;

public class RolesC {
	public String charactername;
	 public String responsibility;
	 
	 
	public RolesC(String charactername, String responsibility) {
		
		this.charactername = charactername;
		this.responsibility = responsibility;
	}
	
	public void display() {
		 System.out.println("My name is :" + charactername + " " + "and my responsibility is :" + responsibility);
	 
}
}
