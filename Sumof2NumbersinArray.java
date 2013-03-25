import java.util.*;

//with recursion
//node.value,node.left,node.right
public class Test{
	private static void Sumof2NumbersinArray(int[] intArray,int sum)
	{
	    HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
	    for (int i=0; i<intArray.length; i++) 
	    {
	        intMap.put(i, intArray[i]);
	        if(intMap.containsValue(sum - intArray[i]))
	            System.out.println("Found numbers : "+intArray[i] +" and "+(sum - intArray[i]));

	    }
	    System.out.println(intMap);
	}
	
	public static void main(String[] args){


		 int[] intArray = {15,5,10,20,25,30};
		 int sum = 35;
		 Sumof2NumbersinArray(intArray,sum);
		
	

	}			
		}

	
