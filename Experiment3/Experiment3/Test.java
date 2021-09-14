public class Test {
 
	private Window window;
	 
	public static void main(String[] args) {
		Window window1= new Window ();
		window1= new VerticalScroll(window1);
		window1= new HorizontalScroll(window1);
		System.out.printIn(this.window + "scroll is successfull!");
	}
	 
}
 
