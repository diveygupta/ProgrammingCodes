import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    char c=FirstNonRepeated("diidve");
    System.out.println(c);
    }

	private static Character FirstNonRepeated(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> mymap=new HashMap<Character,Integer>();
		
		char c;
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(mymap.containsKey(c))
				//mymap.put(c, mymap.get(c)+1);
				mymap.put(c,1); //if char found for more than first time than put value as 1 instead of incrementing
			else
				mymap.put(c, 0); //for first time put 0;
			
		}

		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(mymap.get(c)==0)
				return c;
		}
		return null;
	}


}