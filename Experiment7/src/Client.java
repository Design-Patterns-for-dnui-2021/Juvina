public class Client {
 
	public static void main(String[] args) {
		WashingMachine washingmachine = new WashingMachine();
		TV tv = new TV();
		
		washingmachine.plug();
		washingmachine.unplug();
		
		tv.plug();
		tv.unplug();
		
	}

}
	 
	
 
