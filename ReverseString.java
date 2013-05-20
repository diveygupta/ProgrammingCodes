public String ReverseString(String s)
{
	int len=s.length();
	char temp;
	char[] charArray = s.toCharArray();
	
	for(int i=0;i<len/2;i++)
	{
		temp=charArray[len-1-i];
		charArray[len-i-1]=charArray[i];
		charArray[i]=temp;
	}
	return String.copyValueOf(charArray);
}
	