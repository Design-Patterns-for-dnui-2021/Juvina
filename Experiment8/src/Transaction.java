public abstract class Transaction {
	public final void performTransaction() {
		getNumber();
		doBusiness();
	}

	protected abstract void doBusiness();

	private void getNumber() {
		System.out.println("Get number and go to queuing line");
	}

}