import java.util.*;


public class Test{
	

public static String intTostring(int n)
{


ArrayList<Character> mylist=new ArrayList<Character>();

if(n==0)
mylist.add('0');

boolean check=false;
    if(n<0)
    {
        n=n*(-1);
        check =true;
    }
    int temp=0;
    char c;
    while(n>0)
    {
        temp=n%10;
        c=(char) ('0'+temp);//simple casting or use  Character.toChars(temp);
        mylist.add(c);
        n=n/10;
    
    }
    
if(check==true)
mylist.add('-');

String rev="";
for(char ch:mylist)
	rev=rev+ch;

return (ReverseString(rev));


}

public static String ReverseString(String s)
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
    

	
	public static void main(String[] args){

	System.out.println(intTostring(123));
	}			
}

	
