package week5.day2;

public class Buyer extends Apartment {

	public static void main(String[] args) {
		
		Buyer buys = new Buyer();
		buys.Kitchen();
		buys.serviceArea();
		
	
	}
	
	
	@Override
	public void serviceArea() {


		System.out.println("Store Room");
	}
	
}


