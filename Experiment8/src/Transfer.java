public class Transfer extends Transaction {
	@Override
	public void doBusiness() {
		System.out.println("Transferring money to bank account.");
	}
}