import java.util.*;


public class Test{
	private static  void  removeDuplicates(int[] arr)
	{
		int leftIndex=0,rightIndex=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i<arr.length-1)
			{
				if((arr[i]==arr[i+1]))
				{
				rightIndex++;
				}
				else
				{
				rightIndex++;
				leftIndex++;
				arr[leftIndex]=arr[rightIndex];				
				}
			}
					
		}
		leftIndex++;
		while(leftIndex<arr.length)
		{
			arr[leftIndex]=-1;
			leftIndex++;
		}
	}
	
	public static void main(String[] args){

		int[] arr={1,1,1,2,3,4,55,55,66};
		removeDuplicates(arr);
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
		 
	
	

	}			
		}

	
