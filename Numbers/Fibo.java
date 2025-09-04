public class Fibo{
	public static void main(String[] args){
		int n = 8;
		int temp = n-2;
		int num1 = 0, num2 =1, num3;
		System.out.println("The series :- ");
		System.out.println(num1);
		System.out.println(num2);
		while(temp!=0)
		{
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			temp--;
			System.out.println(num3);
		}
}
}