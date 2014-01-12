
public class TowerOfHanoi {

    public static void  moveDisks(int n, String start, String dest, String temp)
    {

        if(n == 1)
            {
            System.out.println("moving disk 1 from "+ start + " to " +dest );
            return;
            }
        else
        {
            moveDisks(n-1,start,temp,dest);
            
            System.out.println("Move disk "+ n +  " from "+   start +" to "+ dest  );
            
            moveDisks(n-1,temp,dest,start);
            
        }
    }
    
    public static void main(String[] args) {
        
        moveDisks(3, "start", "dest", "temp");
        
    }
}
