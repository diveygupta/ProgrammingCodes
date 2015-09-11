/*
Write a function:
class Solution { public int solution(int A, int B, int K); }
that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
{ i : A ≤ i ≤ B, i mod K = 0 }
For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
Assume that:
A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
Complexity:
expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).*/

public class Test {
	
	public static void main(String[] args) {
		//int[] arr = {0,1,0,1,1};
	 int res = solution(0,2000000000,2000000000);
		
			System.out.print(res);
	}
	
	public static int solution(int A, int B, int K) {
		// calc min no >=A divsible by K
		int res = 0;
		int min = 0;

// count no.s between A & B
		int diff = B - A + 1;
		res = diff/K;
		if(B%K < diff%K)
		{
			return res + 1;
		}
		else {
			return res + 0;
		}
		
    }
	
    }