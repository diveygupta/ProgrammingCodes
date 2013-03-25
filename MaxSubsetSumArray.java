import java.util.*;


public class Test{
	private static void MaxSubsetSum(int[] arr)
	{
		 int sum  = arr[0], maxsum = arr[0];
	        int start = 0;
	        int maxstart = 0;
	        int end = 0;
	        
	        for(int i = 1; i < arr.length; i++)
	        {
	                
	                if(sum < 0)
	                {
	                        sum = arr[i];
	                        maxstart = i;
	                }
	                else
	                {
	                        sum += arr[i];
	                }
	                
	                if(sum > maxsum )
	                {
	                        maxsum  = sum;
	                        start = maxstart;
	                        end = i;
	                }
	        }
	          System.out.println(maxsum); 
		 
		  
	  
	}
	
	public static void main(String[] args){


		 int[] intArray = {-15,-5,-10,-20,-25,-30};
		 
		 MaxSubsetSum(intArray);
		
	

	}			
		}

	
