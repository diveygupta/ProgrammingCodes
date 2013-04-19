import java.util.*;


public class Test{
	private static  boolean Palindrome(int n)
	{
		
		int temp=0,rev=0,no;
		if(n<0)
			n=n*(-1);
		no=n;
		while(n>0)
		{
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		
		return(no==rev);
			
	}
	
	public static void main(String[] args){

		System.out.println(Palindrome(-1121));
	}			
}

	
