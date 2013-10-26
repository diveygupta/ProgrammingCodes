int binary_decimal(int n)  {
	int decimal=0, i=0, rem; 
	while (n!=0) { 
		rem = n%10;
		n/=10; 
		decimal += rem*pow(2,i);
		++i; 
		} 
	return decimal; 
	} 