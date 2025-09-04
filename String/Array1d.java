import java.util.Scanner;
public class Array1d{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int size = a.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of the array :");
		for(int i =0 ; i<arr.length ; i++)
		{
			arr[i] = a.nextInt();
		}
		System.out.print("The elements of the array are:");
		for(int i =0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	

	}
}