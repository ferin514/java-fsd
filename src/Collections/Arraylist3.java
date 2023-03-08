package Collections;
import java.util.*;

public class Arraylist3 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter the elements");
		for(int i=0;i<10;i++) {
			Scanner sc=new Scanner(System.in);
			list.add(sc.nextInt());
		}
		int flag=0;
		for(int i=0;i<10;i++) {
			for(int j=1;j<10;j++) {
				if((list.get(i)+list.get(j))==25) {
					System.out.println(list.get(i) +" "+ list.get(j));
					 flag=1;
					 break;
				}
			}if(flag==1)
				break;
			
		}
		if(flag==1) {
			System.out.println("number is valid");
		}
		else {
			System.out.println("invalid");
		}
	}
}

