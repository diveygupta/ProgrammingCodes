
public class PrintTriangleInOn {

    
   public static void logic1(int n)
    {
        
        int totalStars = (n*n+n)/2;
        int i=0,line = 0,count = 1;
        
        while(i<totalStars)
        {
            if(line == count)
            {
                System.out.println();
                line=0;
                count++;
                
            }
            if(line <= i)
            {
                System.out.print("*");    
                line++;
                i++;
            }
            
        }
    }
   
   
  public static void logic2(int n)
   {
       
       StringBuilder st = new StringBuilder();
       
       for(int i = 0;i<n;i++)
       {
           st.append("*");
           System.out.println(st);
       }
       
       
   }
    
  
    public static void main(String[] args) {
        
    logic1(5);
    System.out.println("\n\n");
    logic2(5);
        
    }
    
}
