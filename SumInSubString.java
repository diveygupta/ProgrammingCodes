//Write a program to add the substring 
//eg :say you have a list {1 7 6 3 5 8 9 } and user is entering a sum 16.Output should display (2-4) that is {7 6 3} cause 7+6+3=16.

import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    	int[] numbers = { 1, 2, 5, 7, 9, 11, 13, 7 };
        int j=0,sum=0 , totalsum = 20;
        
       
        String b = new String();
        for(int i=0; i<numbers.length;i++)
        {
        	sum = numbers[i];
        	b = b + numbers[i];
    		b = b +"\t";
        	for(j=i+1; j<numbers.length; j++)
        	{
        		sum = sum + numbers[j];
        		b = b + numbers[j];
        		b = b +"\t";
        		if(sum == totalsum)
        			System.out.println(b.toString());
        		else if( sum > totalsum)
        			{
        			b = "";
        			sum = 0;
        			break;
        			}
        		
        	}
        	
        }
        	
        	
    }
    
    
}