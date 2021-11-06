public class WashingMachine implements ThreeSocket {
 
	@Override
	public void plug() {
		System.out.println("Washing machine has been plugged from the socket.");
	}

	@Override
	public void unplug() {
		System.out.println("Washing machine has been unplugged from the socket.");
	}
}