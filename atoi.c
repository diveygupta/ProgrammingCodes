int myAtoi(char *str)
{
    int res = 0; 
    int sign = 1;  
    int i = 0;       
    // If number is negative, then update sign
    if (str[0] == '-')
    {
        sign = -1;  
        i++;  
    }
     
    for (i=i; str[i] != '\0'; i++)
        res = res*10 + (int)(str[i] - '0');
   
    return sign*res;
}