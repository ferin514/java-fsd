package ustbatchno3.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	 {
    ApplicationContext context =   
    new ClassPathXmlApplicationContext("ApplicationC.xml");  
    RolesC r=context.getBean("Demo",RolesC.class);
    r.display();
}
}
