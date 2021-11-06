public class TV implements TwoSocket {
 
	@Override
	public void plug() {
		System.out.println("TV has been plugged from the socket.");
	}

	@Override
	public void unplug() {
		System.out.println("TV has been unplugged from the socket.");
	}
}