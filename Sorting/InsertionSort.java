import java.util.*;


public class Test{
	private static  void InsertionSort(int[] a)
	{
	     int i, j, index;
	     for (i = 1; i < a.length; ++i)
	     {
	          index = a[i];
	          for (j = i; j > 0 && a[j-1] > index; j--)
	               a[j] = a[j-1];
	          a[j] = index;
	     }
	}



	 
	  
	 
	
	
	
	public static void main(String[] args){

		int[] arr={17,5,1,4,9,78,987,5,34};
		InsertionSort(arr);
		 
	for(int i:arr)
	{
		System.out.print(i+"\t");
	}
	

	}			
		}

	
 