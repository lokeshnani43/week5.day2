package week5.day2;

public class Buyer3 implements Land {
	
	public void ConPark() {builder();
		
		System.out.println("To construct a Children Park");
	}
	


	
	
	@Override
	public void commericalPurpose() {


		System.out.println("For bulding Shopping complex");
	}

	@Override
	public void builder() {
		
		System.out.println("For bulding Apartment");
		
	}

	@Override
	public void person() {


		System.out.println("For bulding Double Bed Room House");

	}
	
	public static void main(String[] args) {
		
		Buyer3 buy = new Buyer3();
		buy.commericalPurpose();
		buy.builder();
		buy.person();
		buy.ConPark();
	}

}
