package week5.day2;

public class Bank extends SBIBank{

	@Override
	public void cibilScore() {

		System.out.println("My Cibil Score is 5Rating");
	}

	@Override
	public void creditScore() {


		System.out.println("My Credit Score is 900");
	}

	@Override
	public void miniumBalance() {


		System.out.println("My Minium Balance is 55000");
	}
	
	public void maximumLoanAmount() {
		
		System.out.println("Maximum Loan Amount is 70000");
	}	
	
	
	public static void main(String[] args) {
		
		
		Bank ban = new Bank();
		ban.cibilScore();
		ban.maximumLoanAmount();
		ban.creditScore();
		ban.miniumBalance();
		ban.bankBalance();
	}

}
