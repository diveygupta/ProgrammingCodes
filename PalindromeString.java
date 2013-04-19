import java.util.*;


public class Test{
	private static  boolean Palindrome(String str)
	{
		int len=str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){

		System.out.println(Palindrome("dadad"));
	}			
}

	
