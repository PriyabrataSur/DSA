
public class BinarySearch{

	static int backSearch(int[] arr,int k,int mid){
		//int i =0;
		if(arr[mid-1]==k){
			mid = backSearch(arr, k , mid-1);
		}return mid;
		
	}	

	public static void main(String[] args){

		int[] arr = {1,2,2,3,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,7,8,9};
		int k = 1, flag =0, temp =0, mid =0;
	
		int l = 0, r = arr.length;
		while(l<=r){
          	 	mid = (l+r)/2;
         	 	if(arr[mid] == k){
                		flag++;	
				if(mid>0)
					mid = backSearch(arr, k, mid);
				temp = mid;
				break;
           	 	}
           		if(arr[mid]<k){
                		l = mid +1;
            		}else{
               			r = mid-1;
           	 	}
		}
		if(flag==0){
      			System.out.println("Not Found");
		}else{
			System.out.println("Found at :" +temp);
		}
		
	} 

}