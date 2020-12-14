package lithan.training.javawebapp;

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
        System.out.println( "RST: Assignment01 - Spring IoC" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BillingService bilingService = (BillingService) context.getBean("billingService");
        System.out.println(bilingService.toString());
    }
}
