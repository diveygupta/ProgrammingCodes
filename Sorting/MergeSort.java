import java.util.*;


public class Test{
	private static  void MergeSort(int[] array,int low,int high)
	{
		if(low<high)
		{
			int middle=(low+high)/2;
			MergeSort(array,low,middle);
			MergeSort(array,middle+1,high);
			Merge(array,low,middle,high);
		}
	}
	
	private static void Merge(int[] array,int low,int middle,int high)
	{
		int[] a=new int[array.length];
		for(int i=low;i<=high;i++)
			a[i]=array[i];
		
		int left=low,right=middle+1,current=low;
		
		while(left<=middle && right<=high)
		{
			if(a[left]<=a[right])
			{
				array[current]=a[left];
				left++;
			}
			else
			{
				array[current]=a[right];
				right++;
			
			}
			current++;
		}
	
		//copy rem elements
		int rem=middle-left;
		for(int i=0;i<=rem;i++)
			array[current+i]=a[left+i];
	
	}
	
	public static void main(String[] args){

		int[] arr={1,5,4,9,178,987,5,34};
		MergeSort(arr,0,arr.length-1);
		 
	for(int i:arr)
	{
		System.out.print(i+"\t");
	}
	}			
}

	
