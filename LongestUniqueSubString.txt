import java.util.*;

//with recursion
//node.value,node.left,node.right
public class Test{

	private static String LongestUniqueSubString(String str)
	{
		//System.out.println(bigArray.length);
		HashMap<Character,Integer> mymap=new HashMap<Character,Integer>();
		int index=0,length=0,maxlength=0,maxindex=0;
		char c;
		for(int i=0;i<str.length();i++)
		{
						
			c=str.charAt(i);
			if(mymap.containsKey(c))
			{
				if(length>maxlength)
					{
					maxindex=index;
					maxlength=length;
					}
				
				length=0;
				i=mymap.get(c);
				index=i+1;
				mymap.clear();
				continue;
				}
			else
			{
				mymap.put(c,i);
				length++;
				}
		}
		if(length>maxlength)
		{
		maxindex=index;
		maxlength=length;
		}
		return str.substring(maxindex, maxindex+maxlength);
	}
	public static void main(String[] args){
		String str=LongestUniqueSubString("aaabbbcdeddartef");
		System.out.println(str);
	}
}