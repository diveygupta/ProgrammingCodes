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

// in c
void reverseString(char *str)
{
	if(NULL == str) 
	{
		return;
	}
	
	int len = strlen(str);
	for(int i = 0; i <len/2; i++)
	{
		char c = str[i];
		str[i] = str[len-i-1];
		str[len-i-1] = c;
	}
}

// using XOR swap, a^a==0
void reverseString(char *p)
{
  char *q = p;
  while(q && *q) ++q;
  for(--q; p < q; ++p, --q)
    *p = *p ^ *q,
    *q = *p ^ *q,
    *p = *p ^ *q;
}