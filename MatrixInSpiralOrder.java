import java.util.*;

public class Test {

    public static void main(String[] args) {
    	
    	int[][] arr=new int[][] {{1,2,3,4},
    							{5,6,7,8},
    							{9,10,11,12},
    							{13,14,15,16}   };
    	
    	int i=0,k=0,l=0,m=arr.length,n=arr.length;
    	 //k is row  l is column
    	while(k<m && l<n)
    	{
    		//print 1st row
    	for(i=l;i<n;i++)
    		System.out.print(arr[k][i] +"\t");
    	k++;
    		
    	//print last column
    	for(i=k;i<m;i++)
    		System.out.print(arr[i][n-1] +"\t");
    	n--;
    	
    	//print last row
    	if(k<m)
    	{
    	for(i=n-1;i>=l;i--)
    		System.out.print(arr[m-1][i] +"\t");
    	m--;
    	}
    	
    	
    	//print 1st column
    	if(l<n)
    	{
    	for(i=m-1;i>=k;i--)
    		System.out.print(arr[i][l] +"\t");
    	}
    		l++;
    	}
    	
    	}
    }
    	
    