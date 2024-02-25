package ai.ineuron.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyMainApp {

	public static void main(String[] args)throws NullPointerException {
		// TODO Auto-generated method stub
    //   Resource resource=new ClassPathResource("Beans.xml");
      // BeanFactory factory=new XmlBeanDefinitionReader(resource);
		ApplicationContext  factory=new ClassPathXmlApplicationContext("Beans.xml"); 
		factory.getBean("Credit",CreditCardPay.class);
	    factory.getBean("Debit",DebitCardPay.class);
	    paymentProcess process=factory.getBean("Payment",paymentProcess.class);
	    process.doPayment(100.00);
	    }

}
