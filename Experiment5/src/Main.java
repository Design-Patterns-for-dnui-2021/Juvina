public class Main {
	
	public static void main(String[] args) {
		Chef chef = new Chef();
		Chicken chicken = new Chicken(chef);
		MuttonString mutton = new MuttonString(chef);
		Customer Jv = new Customer(chicken, mutton);
		
		Jv.chicken();
		Jv.muttonstring();
	}

}
