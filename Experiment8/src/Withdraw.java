public class Withdraw extends Transaction {
	@Override
	public void doBusiness() {
		System.out.println("Withdrawing money from bank account.");
	}
}