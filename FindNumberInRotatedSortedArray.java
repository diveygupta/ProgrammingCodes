import java.util.*;


public class Test{
	private static boolean find(int[] arr,int left,int right,int k)
	{
		int mid=(left+right)/2;
		if(arr[mid]==k)
			return true;
		if(right<left)
			return false;
		else if(arr[left]<arr[mid])
		{
			if(arr[left]<=k && k<=arr[mid-1])
			return find(arr,left,mid-1,k);
		else 
			return find(arr,mid+1,right,k);
		}
		else if(arr[mid]<arr[right])
		{
			if(arr[mid]<=k && k<=arr[right])
				return find(arr,mid+1,right,k);
			else 
				return find(arr,left,mid-1,k);
		}
		return false;
	}
	
	public static void main(String[] args){

		int[] arr={14,16,18,20,23,24,4,6,8,10,12};
		boolean b=find(arr,0,arr.length-1,14);
	System.out.println(b);
	}			
		}

	
