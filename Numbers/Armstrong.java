import java.util.Scanner;
public class Armstrong{
	public static void main(String []args){
		Scanner a= new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = a.nextInt();
		int sum = 0 ;
		int temp = n ;
		while(n!=0)
		{
			int i = n%10;
			n = n/10;
			sum = sum + i*i*i; 
		}
		//System.out.println(sum);

		if(temp == sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
}
}