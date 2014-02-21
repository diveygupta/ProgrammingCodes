import java.util.*;


public class Test{
	private static  void QuickSort(int[] arr, int left, int right) {
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	 
	      /* partition */
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      }
	 
	      /* recursion */
	      if (left < j)
	    	  QuickSort(arr, left, j);
	      if (i < right)
	    	  QuickSort(arr, i, right);
	}

	public static void main(String[] args){

		int[] arr={17,5,1,4,9,78,987,5,34};
		QuickSort(arr,0,arr.length-1);
		 
	for(int i:arr)
	{
		System.out.print(i+"\t");
	}
	

	}			
		}

	
