import java.util.Scanner;
public class Array2d{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns :");
		int m = a.nextInt();
		int n = a.nextInt();
		int[][] arr = new int[m][n];

		System.out.print("Enter the elements of the array :");
		for(int i = 0 ; i<m ; i++)
		{
			for(int j = 0 ; j<n ; j++)
			{
				arr[i][j] = a.nextInt();
			}
			
		}

		System.out.println("The elements of the array are:");
		for(int i = 0 ; i<m ; i++)
		{
			for(int j = 0 ; j<n ; j++)
			{
				System.out.print(arr[i][j]);

			}
			System.out.println();
			
		}

	}
}