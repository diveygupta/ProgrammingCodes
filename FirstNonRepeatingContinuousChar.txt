public char FirstNonRepeatingContinuousChar(String s)
{
	int len=s.length();
	char[] charArray = s.toCharArray();
	
	for(int i=0;i<len;i++)
	{
		if(charArray[i]!=charArray[i+1])
			return charArray[i];
		else
			{
			while(charArray[i]==charArray[i+1])
				i++;
			}
		}
	return 0;
	
}