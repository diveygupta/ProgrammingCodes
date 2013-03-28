import java.util.*;


public class Test{
	private static int[] merge(int[] arr1,int[] arr2)
	{	
		int[] temp=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				temp[k]=arr1[i];
				i++;
			}
			else
				{
				temp[k]=arr2[j];
				j++;
				}
			k++;
			
		}
		if(arr1.length<arr2.length)
		{
			while(j<arr2.length)
				{
				temp[k]=arr2[j];
				k++;
				j++;
				}
		}
		else
		{
			while(i<arr1.length)
			{
			temp[k]=arr1[i];
			k++;
			j++;
			}
	}
		
		return temp;
	}
	
	public static void main(String[] args){

		int[] arr1={2,4,6,9,12,45,67,78};
		int[] arr2={1,3,4,6,7,8,9,56,344,655};
		int[] temp;
		temp=merge(arr1,arr2);
		
	for(int m=0;m<temp.length;m++)
		System.out.print(temp[m]+"\t");
	}			
		}

	
