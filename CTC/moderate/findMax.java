int getMax(int a, int b)
{
    //calc diff of a and b eg a = 9 ,b = 4  
    int c = a - b;  //c = 5
	
    //check if most sig bit is 0 or 1
    int k = (c >> 31) & 0x1;  //if c>0 then k=0 else k=1

    //find max 
    int max = a - k * c;  // max = 9-0*5 = 9
    return max;  
}