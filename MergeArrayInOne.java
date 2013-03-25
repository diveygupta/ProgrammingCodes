import java.util.*;

//i assume that size of 2 arrays is not given
public class Test{

	private  static void MergeTwoArrayInOne(int[] bigArray,int[] smallArray)
	{
		//System.out.println(bigArray.length);
		int b=(bigArray.length)-1;
		int s=(smallArray.length)-1;
		int i=b-s-1;
		while(s>=0)
		{
			if(bigArray[i]>smallArray[s])
				{
				bigArray[b]=bigArray[i];
				i--;b--;
				}
			else
				{
				bigArray[b]=smallArray[s];
				b--;s--;
				}
		}
		while(i>=0)
		{
			bigArray[b]=bigArray[i];
			i--;b--;
		}
		
		
	}
	public static void main(String[] args){
	int[] b=new int[18];
	 b[0]=1;
	 b[1]=3;
	 b[2]=5;
	 b[3]=8;
	 b[4]=11;
	 b[5]=14;
	 b[6]=78;
	 b[7]=99;
	 b[8]=101;
	 b[9]=202;
	 b[10]=303;
	 b[11]=4444;
	
	int s[]={2,4,6,111,222,333};
	MergeTwoArrayInOne(b,s);
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+"\t");
	}
	}
}