
public class Primebtw{
	public static void main(String[] args){
		int num1 = 2, num2 = 10 , n , flag = 0;
		System.out.println("The prime numbers are :");
		for(n=num1 ; n<=num2 ; n++)
		{
			flag = 0;
			for(int i=2 ; i<=n/2 ; i++)
    			{
        			if(n%i==0)
        			{
					flag = 1;	
				}
    			}
			if(flag == 0)
			{
				System.out.println(n);
			}
		}
}
}