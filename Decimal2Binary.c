#include<stdio.h>
#include<string.h>
int main()
{
int n=7,i;
int k;
                for(i=31;i>=0;i--)
                {
                        k=n>>i;
                        if(k & 1)
                                printf("1");
                        else
                                printf("0");
                }

return 0;
}

//method2
int decimal_binary(int n) 

{ 
	int rem, i=1, binary=0; 
	while (n!=0) 
	{ 
		rem=n%2;
		n/=2;
		binary+=rem*i; 
		i*=10; 
		}
		return binary;
}

