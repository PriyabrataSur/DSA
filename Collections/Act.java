class Box{
	
	double width, height, depth ;
	Box(){
		width = 10;
		height = 10;
		depth = 10;
		System.out.println("Hello");
	}
	Box(double w, double d, double h){
		width = w;
		height =h;
		depth = d;
	}
	double volume(){
		return height * width * depth;
	}	
}

public class Act{


	public static void main(String[] args){

		Box b1 = new Box();
		double res = b1.volume();
		System.out.println(res);
		Box b2 = new Box(5,8,9);
		double result = b2.volume();
		System.out.println(result);
	}

}