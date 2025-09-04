import java.util.Scanner;
public class Primeinp{
	public static void main(String []args){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = a.nextInt();
		boolean flag = true;
		for(int i = 2 ; i<=n/2 ; i++ )
		{
			if(n%i==0)
			{
				flag = false ;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
}
}