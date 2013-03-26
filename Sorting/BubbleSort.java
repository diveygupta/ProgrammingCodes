import java.util.*;


public class Test{
	private static void BubbleSort(int[] a)
	{
	     int i, j, temp;
	     for (i = 0; i < (a.length - 1); i++)
	     {
	          for (j = 0; j < a.length - 1 - i; j++ )
	          {
	               if (a[j] > a[j+1])
	               {
	                    temp = a[j+1];
	                    a[j+1] = a[j];
	                    a[j] = temp;
	               }
	          }
	     }
	}

	 
	  
	 
	
	
	
	public static void main(String[] args){

		int[] arr={1,5,4,9,78,987,5,34};
		BubbleSort(arr);
		 
	for(int i:arr)
	{
		System.out.print(i+"\t");
	}
	

	}			
		}

	
