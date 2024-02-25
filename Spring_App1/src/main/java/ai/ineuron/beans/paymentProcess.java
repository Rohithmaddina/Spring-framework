package ai.ineuron.beans;

public class paymentProcess {
	private iPay pay;
	public paymentProcess(iPay pay) {
		this.pay=pay;
		System.out.println("payment");
		}

	public void 	setPay(iPay pay) throws NullPointerException
	{
		this.pay=pay;
		
	}
	public void doPayment(double amt) throws NullPointerException
	{
		boolean paymentDone=pay.payBill(amt);
		if(paymentDone)
		{
			System.out.println("Payment Success");
			}
		else {
			System.out.println("Payment fail");
		}
}
}
