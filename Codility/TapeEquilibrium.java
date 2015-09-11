/*
 A non-empty zero-indexed array A consisting of N integers is given. Array A represents     numbers on a tape.
 

Any integer P, such that 0 < P < N, splits this tape into two non empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the **absolute** difference between the sum of the first part and the sum of the second part.

Example:

A[0] = 3
A[1] = 1
A[2] = 2
A[3] = 4
A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7

*/

class Test {
	public static void main(String[] args) {
		int[] arr = {-3,1,-2,4,3};
		int p = findMinP(arr);
		System.out.println(p);
	}

	private static int findMinP(int[] A) {
		long remSum = 0;
		for (int i=1;i<A.length;i++) {
			remSum += A[i];
		}
		
		//int minIndex = 0;
		long x = A[0];
		long minDiff = Math.abs(x - remSum);
		
		for(int i=1;i<A.length;i++) {
			
			long diff = Math.abs(x - (remSum));
			if(diff < minDiff) {
				//minIndex = i;
				minDiff = Math.abs(Math.abs(x) - Math.abs(remSum));
			}
			x += A[i];
			remSum -= A[i];  
		}
		
		return (int)minDiff;
	}
}






