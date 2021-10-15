public class MuttonString implements Waiter {
 
	private Chef chef;
	 
	void MuttonString(Chef chef) {
		this.chef =chef;
	 
	} 
	public void Order() {
		chef.mutton();
	}
	 
}
 
