package ustbatchno3.SetterInjection;

public class Roles {
	public String charactername;
	 public String Responsibility;
	public String getCharactername() {
		return charactername;
	}
	public void setCharactername(String charactername) {
		this.charactername = charactername;
	}
	public String getResponsibility() {
		return Responsibility;
	}
	public void setResponsibility(String responsibility) {
		Responsibility = responsibility;
	}
	@Override
	public String toString() {
		return "Roles [charactername=" + charactername + ", Responsibility=" + Responsibility + "]";
	}
public void display() {
 System.out.println("My name is :" + charactername + " " + "and my responsibility is :" + Responsibility);
}
}
