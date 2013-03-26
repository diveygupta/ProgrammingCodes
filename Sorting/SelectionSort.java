import java.util.*;


public class Test{
	private static  void SelectionSort(int[] a)
	{
	     int i,j, min, temp;
	     for (i = 0; i < a.length - 1; ++i)
	     {
	          min = i;
	          for (j = i+1; j < a.length; ++j)
	          {
	               if (a[j] < a[min])
	                    min = j;
	          }
	          //swap least with a[i]
	          temp = a[i];
	          a[i] = a[min];
	          a[min] = temp;
	     }
	}


	 
	  
	 
	
	
	
	public static void main(String[] args){

		int[] arr={1,5,4,9,78,987,5,34};
		SelectionSort(arr);
		 
	for(int i:arr)
	{
		System.out.print(i+"\t");
	}
	

	}			
		}

	
