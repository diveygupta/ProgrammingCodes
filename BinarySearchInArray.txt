import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    int[] arr={1,2,5,8,10,34,17,34,78};
    int s=BinarySearchInArray(arr,34);
    System.out.println(s);
    }
   
    	
	private static int BinarySearchInArray(int[] arr,int target) {
		// TODO Auto-generated method stub
		int index=0,upper,lower=0,center;
		upper=arr.length-1;
		center=(lower+upper)/2;
		for(lower=0;lower<upper;lower++)
		{
			center=(lower+upper)/2;
			if(arr[center]==target)
				return center;
			else if(arr[center]<target)
				{
				lower=center+1;
				}
			else 
			{
			upper=center-1;	
			}
			
		}
		return index;
	}


}