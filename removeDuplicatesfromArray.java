import java.util.*;


public class Test{
	private static  ArrayList<Integer>  removeDuplicates(int[] arr)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		HashMap<Integer, Integer> mymap=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!(mymap.containsKey(arr[i])))
				{
				list.add(arr[i]);
				mymap.put(arr[i],1);
				}
		}
		return list;
	}
	
	public static void main(String[] args){

		int[] arr={4,5,4,6,1,32,64,32};
		ArrayList<Integer> list=removeDuplicates(arr);
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
	
	
											}			
		}

	
