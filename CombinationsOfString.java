import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    	String str="abc";
    	Combination("",str);
   
    }
    	
	private static void Combination(String prefix,String str) {
		// TODO Auto-generated method stub
		int len=str.length();
		System.out.println(prefix);
		for(int i=0;i<len;i++)
		{
			Combination(prefix+str.charAt(i), str.substring(i+1));
		}
		
	}


}