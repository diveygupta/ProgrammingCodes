import java.util.*;


public class MagicSquare{
	
	
	  public static void main(String[] args) {
	    	
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter odd no");
		  int order = scan.nextInt();
		  if(order%2==0)
			 System.exit(0);

		  getMagicSquare(order);
	   
	    }

	private static void getMagicSquare(int order) {
		
		int[][] mat =  new int[order][order];
		
		int r=0, c=order/2;
		mat[r][c] = 1;
		
		for(int i=2; i<=order*order; i++)
		{
			if(r==0)
				r=order-1;
			else
				r=r-1;
			if(c==order-1)
				c=0;
			else 
				c=c+1;
			
			if(mat[r][c]==0 )
			mat[r][c] = i;
			else
			{
				r = (r+2)%order;
				c = (c-1);
				if(c<0)
					c=order-1;
				mat[r][c] = i;
			}
			
		}
		
		
		//print matrix
		for(int i=0;i<order;i++)
		{	for(int j=0;j<order;j++)
			{	System.out.print(mat[i][j] + "\t");}
		System.out.println();
		}
		
	}
	    	
		
	}

	
