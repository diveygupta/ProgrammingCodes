import java.util.*;

public class Test {

    public static void main(String[] args) {
    
    	int n= 200,i=1;
    	
    	while(i<=n/2)
    	{
			if(n%i==0)	
				System.out.print(i + "\t");
			i++;
    	}
				System.out.print(n);
    	}

}