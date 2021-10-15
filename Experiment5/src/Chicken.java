public class Chicken implements Waiter {
 
	private Chef chef;
	 
	Chicken(Chef chef) {
		this.chef = chef;
	}
	 
	public void Order() {
		chef.chicken();
	}
	
}
 
