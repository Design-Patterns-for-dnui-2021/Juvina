public class PrinterPoolSingleton {
 
	private static PrinterPoolSingleton instance;
	
	private String name;
	 
	private PrinterPoolSingleton(String name) {
		this.name = name;
	}
	 
	public static PrinterPoolSingleton getInstance(String name) {
		if (instance == null && !name.equals(null)) {
			 instance = new PrinterPoolSingleton(name);
		}
		return instance;
	}
	 
	public void overseeTasks() {
		System.out.println(name + "...");
	 
	}
	 
}


 
