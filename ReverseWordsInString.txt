import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    String s=ReverseWordsInString("I hate theory");
    System.out.println(s);
    }
    private static String ReverseString(String s)
    {
    	int len=s.length();
    	char temp;
   
    	char[] charArray = s.toCharArray();
    	
    	for(int i=0;i<len/2;i++)
    	{
    		temp=charArray[len-1-i];
    		charArray[len-i-1]=charArray[i];
    		charArray[i]=temp;
    	}
    	return String.copyValueOf(charArray);
    }
    	
	private static String ReverseWordsInString(String str) {
		// TODO Auto-generated method stub
		String newstr="",temp="";
		str=ReverseString(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				newstr+=ReverseString(temp);
				newstr+=' ';
				temp="";
				continue;
			}
			else
			temp+=str.charAt(i);
		}
		newstr+=ReverseString(temp);//to copy last substring
		return newstr;
	}


}