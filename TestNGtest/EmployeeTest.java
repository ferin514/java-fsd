package ustbatchno3.TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class EmployeeTest{
@Test
public void testforemployee() {
	Employee e=new Employee("sharath",30,"java");
	Assert.assertEquals(e.getName(),"sharath");
	Assert.assertEquals(e.getAge(),30);
}

}
