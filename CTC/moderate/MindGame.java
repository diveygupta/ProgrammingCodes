import java.util.Arrays;


public class MindGame {

    private static void hits(String input,String solution)
    {
        //colors[0]->B colors[1]->G colors[2]->R colors[3]->Y
        int[] colors = new int[4];
        Arrays.fill(colors, 0);
        int hits = 0, phits = 0;
        
        if(input.length() != solution.length())
            return;
        
        for(int i=0;i<solution.length();i++)
        {
            if(input.charAt(i) == solution.charAt(i))
                hits++;
            else
            {
                int index = getColor(solution.charAt(i));
                colors[index]++;
            }          
        }
        
        for(int i=0;i<solution.length();i++)
        {
            if(input.charAt(i) != solution.charAt(i))
            {
                int index = getColor(input.charAt(i));
                if(colors[index]>0)
                {
                    phits++;
                    colors[index]--;
                }
            }
        }
        
        System.out.println("hits="+hits+ " and pseudohits="+phits);
    }
    
    private static int getColor(char c)
    {
        switch(c)
        {
            case 'B':
                return 0;
            case 'G':
                return 1;
            case 'R':
                return 2;
            case 'Y':
                return 3;
            default:
                return -1;
        }
    }
    
    
    public static void main(String[] args) {
        
        hits("RBGY", "RRBG");
    }
}
