package Sampleprograms;
import java.util.*;
public class Reversestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt( i);
		
		
		
		// TODO Auto-generated method stub

	}System.out.println("The reversed string is:" +rev);

	}
}
