package week5.day2;

public class Automation extends MultipleLangauge{
	
	@Override
	public void Java() {


		System.out.println("Joined in Java Classes");
	}

	@Override
	public void Selenium() {


		System.out.println("Joined in Selenium Classes");

	}


	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();

	}

	

}
