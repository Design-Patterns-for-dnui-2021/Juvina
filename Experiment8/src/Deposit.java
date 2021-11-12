public class Deposit extends Transaction {
	@Override
	public void doBusiness() {
		System.out.println("Deposit money to bank account.");
	}
}
