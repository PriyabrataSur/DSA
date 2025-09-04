import java.util.Scanner;
public class Palindrome{
	public static void main(String []args){
		Scanner a= new Scanner(System.in);
		System.out.print("Enter the number :");
		int n = a.nextInt();
		int temp = n;
		int rev = 0;
		while(n!=0)
		{
			int i = n%10;
			n = n/10;
			rev = rev *10 + i;
		}
		//System.out.println(rev);
		
		if(temp == rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}

}
}
