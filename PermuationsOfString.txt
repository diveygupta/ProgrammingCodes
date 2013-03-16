import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    	String str="aaa";
    	Permutation("",str);
   
    }
    	
	private static void Permutation(String prefix,String str) {
		// TODO Auto-generated method stub
		int len=str.length();
		if(len==0)
			System.out.println(prefix);
		for(int i=0;i<len;i++)
		{
			Permutation(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1, len));
		}
		
	}


}