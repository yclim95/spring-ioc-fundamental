package lithan.training.javawebapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring IoC
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "RST: Assignment01 - Spring IoC" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        BillingService bilingService = (BillingService) context.getBean("billingServiceGPay");
        System.out.println(bilingService.toString());
        bilingService = (BillingService) context.getBean("billingServiceCard");
        System.out.println(bilingService.toString());
        ((AbstractApplicationContext) context).close();
    }
}
