//Eg : 1716 = 143*1*4*3 =1716so 143 is the seed of 1716.
//find all possible seed for a given number.
//// Input   ||  OUTPUT 
////  1250        125       125*1*2*5
////  174720      1456   1456*1*4*5*6

import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    int n = 174720;
    int m,j;
    
    if(n == 1)
    	System.out.println(1);
    
    for(int i=0;i<=n/2;i++)
    {
    	m = j =i;
    	
    	while(j > 0)
    	{
    		m = m * (j%10);
    		j = j/10;
    		
    	}
    	
    	if( m == n)
    		System.out.println(i);
    }
        	
    }
    
    
}