import java.util.Scanner;
public class Fiboinp{
	public static void main(String []args){
		Scanner a= new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = a.nextInt();
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
