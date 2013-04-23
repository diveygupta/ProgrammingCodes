import java.util.*;


public class Test{
	
	
	private static boolean StringHasUniqueChars(String str)
	{
	if(str.length()>256) return false;

	boolean[] set=new boolean[256];

	for(int i=0;i<str.length();i++)
	{
		int a=str.charAt(i);
		if(set[a])
			return false;
		else
			set[a]=true;
		}
	return true;
	}
	
	public static void main(String[] args){

	System.out.println(StringHasUniqueChars("abbbbcd"));
	}			
}

	
