import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    String s=RemoveSpecificChars("diidve wef","ed");
    System.out.println(s);
    }

	private static String RemoveSpecificChars(String str,String remove) {
		// TODO Auto-generated method stub
		String newstr="";
		HashMap<Character, Integer> mymap=new HashMap<Character,Integer>();
		
		char c;
		for(int i=0;i<remove.length();i++)
		{
			c=remove.charAt(i);
			if(mymap.containsKey(c)){} 
			else mymap.put(c, 1);
		}

		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(!(mymap.containsKey(c)))
				newstr+=c;
		}
		return newstr;
	}


}