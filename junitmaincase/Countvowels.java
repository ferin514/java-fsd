package ustbatchno3.junittestcase;

public class Countvowels {

	public static void main(String[] args) {
		
		String S="Meenakshi";
		System.out.println(" Count of Vowels are :" +vowelscount(S));
		
	}

	public static int vowelscount(String s) {
		String S="Meenakshi";
		int count=0;
		 S=S.toLowerCase();
		for(int i=0;i<S.length();i++) {
		if(S.charAt(i)=='a' || S.charAt(i)=='e'|| S.charAt(i)=='i'||S.charAt(i)=='o' ||S.charAt(i)=='u') {
			count++;
		}
		}return count;
	}

}
