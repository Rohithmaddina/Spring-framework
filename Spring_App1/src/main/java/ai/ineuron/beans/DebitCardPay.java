package ai.ineuron.beans;

public class DebitCardPay implements iPay {

	DebitCardPay(){
        System.out.println("Debitcard Object is created by IOC");
    }
    public boolean payBill(double amount)
    {
    	System.out.println("Paying through Creditcard");
        return false;
    }

}
