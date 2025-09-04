import java.util.Scanner;
public class Binarysrch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the elements of the array in sorted order :");
		for(int i =0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number want to find in the array :");
		int num = sc.nextInt();
		int low = 0, mid = 0;
		int high = arr.length;
		boolean flag = false ;
		while(low<=high)
		{
			mid = (low + high)/2 ;
			if(num == arr[mid])
			{
				flag = true;
			}
			if(num < arr[mid])
			{
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
		if(flag)
		{
			System.out.print("The index of the element is :" +mid);
		}else{
			
			System.out.print("	NOT FOUND	");

		}
}
}