abstract class Car{
	abstract int price();

}

class BMW extends Car{
	int price(){
		return 140000;
	}
}

class Audi extends Car{
	int price(){
		return 230000;
	}
}

public class Abstrac{
	public static void main(String[] args){
		Car c1= new BMW();
		int p1 = c1.price();
		Car c2= new Audi();
		int p2 = c2.price();
		System.out.println("The price of BMW cars is " +p1);
		System.out.println("The price of Audi cars is " +p2);
	}
}