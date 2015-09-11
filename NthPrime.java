// Find the nth prime no, for eg In 2,3,5,7,11,13,17,19... 7th prime no is 17 

import java.util.ArrayList;

public class Test {
    
  public static void main(String[] args) {
    
         int n = 39; // get nth prime no
         int number = NthPrime(n);
         System.out.println(number);
  }

private static int NthPrime(int n) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	// adding 2 & 3 as prime numbers
	list.add(2);
	list.add(3);
	
	int nextNumber = 5;
	int counter = n;
	while(list.size() < n) {
		if(isPrime(nextNumber)) {
			// only pass odd numbers
			list.add(nextNumber);
			counter++;
		}
		
		nextNumber = nextNumber + 2;
	}
	
	return list.get(n-1);
}

private static boolean isPrime(int no) {
	// no need to check divisibily by even numbers, go till sqrt(no)
	for(int i = 3; i <= Math.sqrt(no); i=i+2) {
		if(no%i == 0) {
			return false;
		}
	}
	
	return true;
}
}