package ustbatchno3.SetterInjection;

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
    		    new ClassPathXmlApplicationContext("application.xml");  
    	Roles r=context.getBean("Demo",Roles.class);
    	r.display();
    	Roles r1=context.getBean("Demo2",Roles.class);
    	r1.display();
    	Roles r2=context.getBean("Demo3",Roles.class);
    	r2.display();
    	        
    }
}
