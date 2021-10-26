import java.util.Scanner;

public class Client {
	
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Printing...");
		
		try {
			System.out.println("Selection operation:");
			System.out.println(" D ――Delete");   
			System.out.println(" A ――Abort");  
			System.out.println(" C ――Change Task Priorities");   
			System.out.println(" E ――Exit");  
			
			sc = new Scanner(System.in);
			
			while(true) {
				switch (sc.next()) {
				case "D":
					PrinterPoolSingleton DeletePrint = PrinterPoolSingleton.getInstance("Delete");
					DeletePrint.overseeTasks();
					break;
				case "A":
					PrinterPoolSingleton AbortPrint = PrinterPoolSingleton.getInstance("Abort");
					AbortPrint.overseeTasks();
					break;
				case "C":
					PrinterPoolSingleton ChangeTaskPrioritiesPrint = PrinterPoolSingleton.getInstance("Change Task Priorities");
					ChangeTaskPrioritiesPrint.overseeTasks();
					break;
				case "E":
					System.exit(1);
					break;
				default:
					break;
				}
			}
			
		} catch (Exception e) {
			new PrinterPoolException(e.getMessage());
		}
		
	}

}
	 
 
