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








// c implementation

#include <stdio.h>

void reverse(char *start, char *end) {
    while(start < end) {
        char temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}

void reverseString(char *str) {
    char *start = str;
    char *end = str;
    while(*end) {
        end++;
        if(*end == '\0') {
            reverse(start, end-1);    
            break;
        } else if(*end == ' ') {
            reverse(start, end-1);
            start = end+1;
        } 
    }
    
    reverse(str, end-1);
}

int main()
{
   // printf("Hello, World!\n");
   // int i = 5;
   // int *j = &i;
    char str[] = "hello world";
    reverseString(str);
    printf("%s\n",str);
    return 0;
}

