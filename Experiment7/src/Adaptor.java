public class Adaptor implements ThreeSocket {
 
	 TwoSocket twosocket;
	 
	public Adaptor(TwoSocket twosocket) {
		this.twosocket = twosocket; 
	}
	
	@Override
	public void plug() {
		twosocket.plug();
	}
	 
	@Override
	public void unplug() {
		twosocket.unplug();
	 
	}
	 
}
 
