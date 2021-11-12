public class Client {
	public static void main(String[] args) {
		Deposit account1 = new Deposit();
		Transfer account2 = new Transfer();
		Withdraw account3 = new Withdraw();
		
		account1.performTransaction();
		account2.performTransaction();
		account3.performTransaction();
	}
}