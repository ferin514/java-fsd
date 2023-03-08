package Collections;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//creating ArrayList
		list.add("Meenakshi");
		list.add("Devika");
	    list.add("Amitha");
	   //Traversing list through iterator
	    Iterator itr=list.iterator();//creating iterator
	    while(itr.hasNext()){//accessing each elements
	    	System.out.println(itr.next());
	    }
		// TODO Auto-generated method stub

	}

}
