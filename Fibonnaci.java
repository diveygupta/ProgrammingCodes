
public class Fibonnaci {

    static int[] arr;
    
    
    static int Fibonacci_Recursive(int n)
    {
         arr = new int[n+1];
         arr[0]=0;
         arr[1]=1;
       
         return Fib_R(n);      
    }
    
    private static int Fib_R(int n)
    {
        
        if(n == 0)
            return arr[0];
        if(n == 1)
            return arr[1];
        else
        {
        arr[n] = Fib_R(n-1) + Fib_R(n-2);
        return arr[n];
        }
    }
    
    static void Fibonacci_Iterative(int n)
    {
        
        int prev1 = 0, prev2 = 1,temp;
        
            System.out.print(prev1 + "\t" + prev2 + "\t"); 
       
        for(int i = 0 ; i < n-1;i++)
            {
            temp = prev1; 
            prev1 = prev2;
            prev2 = temp + prev2;             
            System.out.print(prev2 + "\t");
            }
        
    }
    
    
    public static void main(String[] args) {
        
        Fibonacci_Iterative(9);
        System.out.println();
        System.out.println(Fibonacci_Recursive(9));
    }
    
}
