package week5.day2;

public class LearnConstructor {
	
	int x = 55;
	float y = 55.5f;
	
	
	LearnConstructor(){
		System.out.println("I am a Constructor");
	}
	
	LearnConstructor(String Name){
		System.out.println("My name is : " +Name);
	}
	
	LearnConstructor(String colName, int roll){
		colName = "SK University";
		System.out.println("College name is " +colName+ ":" +roll);
	}
	
	public void method() {
		System.out.println("Normal method");
	}
	

	public static void main(String[] args) {


		LearnConstructor lol = new LearnConstructor();
		LearnConstructor lol1 = new LearnConstructor("Lokesh Kumar");
		LearnConstructor lol2 = new LearnConstructor("Lokesh Kumar",  22);

		int x2 = lol.x;
		float y2 = lol.y;
		
		
		System.out.println(x2);
		System.out.println(y2);
		lol.method();

		
	}

}
