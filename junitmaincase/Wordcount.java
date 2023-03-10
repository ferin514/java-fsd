package ustbatchno3.junittestcase;

import java.util.*;
import java.util.stream.Collectors;

public class Wordcount {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("amitha","devika","amitha","devika","meenu","amitha");
	}
	public static Set<String> counting(List words){
		Set<String> names=new HashSet<String>(words);
		for(String key:names)
		{
			System.out.println(key +"" + Collections.frequency(words, key));
		} 
		return names;		
	}
}
		
		

