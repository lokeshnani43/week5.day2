package week5.day2;

public class LearnStaticFinal {
	
	static int x = 22;
	static int y = 10;
	final int r = 11;
	int z = 1;
	

	public static void main(String[] args) {


		LearnStaticFinal obj = new LearnStaticFinal();
		int z2 = obj.z;
		y = 30; 
		System.out.println(z2);
		System.out.println(obj.r);
		System.out.println(x+10);
		System.out.println(y);
	}

}
