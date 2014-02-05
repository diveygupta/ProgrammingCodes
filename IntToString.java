import java.util.*;


public class Test1{
    

public static String intTostring(int n)
{

char[] arr = new char[10+1]; //largest int is of 10 digits on 32 bit machine +1 is for -ve
StringBuilder rev = new StringBuilder();
boolean check=false;

if(n == 0)
return rev.append('0').toString();


    if(n < 0)
    {
        n = n*(-1);
        check = true;
    }
    int temp = 0, i = 0;
    char c;
    while(n>0)
    {
        temp=n%10;
        c=(char) ('0'+temp);//simple casting or use  Character.toChars(temp);
        arr[i++] = c;
        n=n/10;
    
    }
    
if(check==true)
rev.append('-');


while(i > 0)
    rev.append(arr[--i]);

return rev.toString();
}



    
    public static void main(String[] args){

    System.out.println(intTostring(-9123));
    }           
}

    
