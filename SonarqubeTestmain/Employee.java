package ustbatchno3.SonarqubeTest;

public class Employee {
	private String name;
	private int age;
	private int years;
	private double salary;
	public Employee(String name, int age, int years, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.years = years;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static Object stream() {
		return null;
	}
	

}
