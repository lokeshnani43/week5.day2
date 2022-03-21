package week5.day2;

public class MyBank extends SBI implements RBI{
	

	public static void main(String[] args) {
		
		SBI ban = new SBI();
		ban.openAccount();
		ban.provideDebitCard();
		ban.provideCreditCard();
		RBI ban1 = new SBI();
		ban1.openAccount1();
		ban1.provideDebitCard();
		ban1.provideCreditCard();
		
	}
}
