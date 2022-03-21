package week5.day2;

public  class University  extends College{

	public static void main(String[] args) {
		
		University col = new University();
		col.courses();
		col.infrastructure();
	}
	@Override
	public void infrastructure() {


		System.out.println("It is a 4 acres College with highly infrastructred");
	}

}
