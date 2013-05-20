#include<stdio.h>
#include<string.h>

void quicksort(int *a,int count)
{
  int i,j, min, temp;
             for (i = 0; i <count-1 ; ++i)
             {
                  min = i;
                  for (j = i+1; j < count; ++j)
                  {
                       if (a[j] < a[min])
                            min = j;
                  }
                  //swap least with a[i]
                  temp = a[i];
                  a[i] = a[min];
                  a[min] = temp;
             }

}
void SortOddEven( int* numbers, int count ){
int i,j=0,k=0;
int oddcount=0;
  if(count<1)
  return;
  for (i = 0; i <6; ++i)
        {
		if(numbers[i]%2!=0)
        oddcount++;}
int odd[oddcount],even[count-oddcount];
j=0;
 for (i = 0; i <6; ++i)
        {
		if(numbers[i]%2!=0)
			{
			odd[j]=numbers[i];
			j++;
			}
			else
			{
			even[k]=numbers[i];
			k++;
			}
		}


		quicksort(&odd[0],oddcount);
		quicksort(&even[0],count-oddcount);
          for (i = 0; i <oddcount ; ++i)
        	numbers[i]=odd[i];
        
		  for (j = 0; j <count-oddcount ; ++j,++i)
        		numbers[i]=even[j];
        }
int main()

{
int i,a[6]={1,3,2,6,5,4};
SortOddEven(&a[0],6);
  for (i = 0; i <6 ; ++i)
        printf("%d",a[i]);
return 0;
}

