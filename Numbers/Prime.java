public class Prime{
	public static void main(String []args){
		int n = 23 ; 
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