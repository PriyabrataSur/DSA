abstract class Myclass{
	abstract void myDetails();
	void age(){
		System.out.println("My age is 19");
	}
}

class Priyabrata extends Myclass{
	@Override
	void myDetails(){
		System.out.println("My name is Priyabrata");
	}
}

public class Abstr{
	public static void main(String[] args){
		Priyabrata obj1 = new Priyabrata();
		obj1.myDetails();
		obj1.age();
	}
}