public class CreditCardPayment implements IPaymentMethod {

	@Override
	public void payCoffee(ICoffee coffee)
	{	
		System.out.println("pay " + coffee.cost() + " for " + coffee.getDescription() + "by credit card");
	}

}