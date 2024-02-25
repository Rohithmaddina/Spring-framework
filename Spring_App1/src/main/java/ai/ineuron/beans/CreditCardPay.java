package ai.ineuron.beans;

public class CreditCardPay implements iPay {

	CreditCardPay()
    {
        System.out.println("CreditCard Object is created by IOC");
    }
    public boolean payBill(double amount)
    {
    	System.out.println("Paying through Creditcard");
    	return true;
    }
}
