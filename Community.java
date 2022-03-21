package week5.day2;

public  class Community extends Apartment {

	public void homeTeatre() {
		System.out.println("Community Property");
	}

	public static void main(String[] args) {
		
		Community call = new Community();
		call.Kitchen();
		call.serviceArea();
		call.homeTeatre();
	}
	@Override
	public void serviceArea() {
		// TODO Auto-generated method stub
		
	}

}
