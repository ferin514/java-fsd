package ustbatchno3.SonarqubeTest;

import java.util.Arrays;
import java.util.List;

public class Employeemain {

	public static void main(String[] args) {
	Employee e1=new Employee("Meenakshi",23,5,50000);
	Employee e2=new Employee("Devika",21,6,60000);
	Employee e3=new Employee("Amitha",25,7,70000);
	 List<Employee> employees = Arrays.asList(e1,e2,e3);
	 employees.stream().forEach(
			 val -> {
				 if(val.getYears()>=1 &&  val.getYears()<=2) {
					 double newsalary=val.getSalary() +(val.getYears()*2.5/100);
					 val.setSalary(newsalary);
				 }
				  if(val.getYears()>=3 &&  val.getYears()<=6) {
					 double newsalary=val.getSalary() +(val.getYears()*5.0/100);
					 val.setSalary(newsalary);
				 
			 }
				 else if(val.getYears()>=7 &&  val.getYears()<=10) {
					 double newsalary=val.getSalary() +(val.getYears()*10.0/100);
					 val.setSalary(newsalary);
				 }
				 else if(val.getYears()>10) {
				 double newsalary=val.getSalary() +(val.getYears()*12.0/100);
				 val.setSalary(newsalary);
				 	}
			 }
	);
	 employees.forEach(val->
	 System.out.println(val.getSalary()));
}
}