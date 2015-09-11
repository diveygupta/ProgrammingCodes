/*
A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
class Solution { public int solution(int[] A); }
that, given a zero-indexed array A, returns the value of the missing element.
For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
Assume that:
N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:
*/

class Test {
	public static void main(String[] args) {
		int[] arr = {2,1,3,5};
		int p = solution(arr);
		System.out.println(p);
	}

	public static int solution(int[] A) {
		// slow solution
		/*
        long totalSum = 0;
        for(long i:A) {
            totalSum+=i;
        }
        
        int len = A.length;
        // 1 more than length n*(n+1)/2;
        long expectedSum = (len+1)*(len+2)/2;
        
		return (int)(expectedSum - totalSum);
		*/
		
		// Xor with itself is 0
		long missing = A.length + 1;
		for(int i=0;i<A.length;i++) {
			missing = missing ^ (i+1) ^ A[i]; 
		}
		// 5 ^ 1 ^ 2^ 3 ^ 4 ^ 2 ^ 1 ^ 3 ^ 5
		return (int) missing;
    }
}






