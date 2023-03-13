package ustbatchno3.TestNG;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maincompany {

	public static void main(String[] args) {
		List<Company>list=Collections.emptyList();
		Company c1=new Company("TVM",1600,800);
		Company c2=new Company("Chennai",1800,1000);
		Company c3=new Company("Mumbai",2500,1200);
		Company c4=new Company("Kochi",1800,1200);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		System.out.println("Enter the city :");
		Scanner sc=new Scanner(System.in);
		String city=sc.nextLine();
		System.out.println("Enter the square feet :");
		Scanner sc1=new Scanner(System.in);
		int sq=sc1.nextInt();
		double total=list.stream().filter(val->val.getCities().equals("Mumbai"))	.map(val->val.total(sq));
				
			
		

	}

}
