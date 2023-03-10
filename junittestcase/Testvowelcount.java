/**
 * 
 */
package ustbatchno3.junittestcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class Testvowelcount {
	

		 

		 @Test

		 public void counttesting() {

		 

		 String S ="Meenakshi";

		 

		 int expected=4;

		 int actual=Countvowels.vowelscount(S);

		 assertEquals(expected,actual);

		 

		 }
}

		 

		 

		 

		 

		