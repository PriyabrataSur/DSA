class Figure{
	double dim1;
	double dim2;
	Figure(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	double area(){
		System.out.println("Undefined");
		return 0.0;
	}
}

class Rectangle extends Figure{
	Rectangle(double d1, double d2){
		super(d1,d2);
	}
	@Override
	double area(){
		System.out.println("Area of Rectangle: ");
		return dim1*dim2;
	}
}

public class AreaOverrid{
	public static void main(String[] args){
		Figure f =  new Figure(20,20);
		Rectangle r = new Rectangle(10,10);
		System.out.println(f.area());
		System.out.println(r.area());
		Figure fig ;
		fig = r;
		System.out.println(fig.area());		

	}
}