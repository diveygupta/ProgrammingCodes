
public class x_power_n {

    //algo1
    public static int power1(int x,int n)
    {
        if(x == 0)
            return 0;
        if(n == 0 || x==1)
            return 1;
        
        int res = 1;
        
        //optimising to run for n/2 times
        //if even then calc x^n/2 and square the result
        if(n % 2 == 0)
            {
            for(int i = 0; i < n/2; i++)
                res = x * res;
        
            return res*res;    
            }
        else
        {
            for(int i = 0; i < n/2; i++)
                res = x * res;
        
            return res*res*x;    
         }
        
        
    }
    
    //algo2
    public static int power2(int x, int n) 
    {
        if(x == 0)
            return 0;
        if(n == 0 || x == 1)
            return 1;
    
        int res = power2(x , n/2); 
        
        if(n % 2 == 0)
            return res*res;
        else
            return res*res*x;

    }
    
    
    public static void main(String[] args) 
    {
        
        //algo1
        System.out.println(power1(7,3));
        
        //algo2
        System.out.println(power2(5,4));
        
    }
    
}
