/*
You are given N counters, initially set to 0, and you have two possible operations on them:
increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.
A non-empty zero-indexed array A of M integers is given. This array represents consecutive operations:
if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
For example, given integer N = 5 and array A such that:
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the values of the counters after each consecutive operation will be:
    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
The goal is to calculate the value of every counter after all operations.
Write a function:
class Solution { public int[] solution(int N, int[] A); }
that, given an integer N and a non-empty zero-indexed array A consisting of M integers, returns a sequence of integers representing the values of the counters.
The sequence should be returned as:
a structure Results (in C), or
a vector of integers (in C++), or
a record Results (in Pascal), or
an array of integers (in any other programming language).
For example, given:
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
the function should return [3, 2, 2, 4, 2], as explained above.
Assume that:
N and M are integers within the range [1..100,000];
each element of array A is an integer within the range [1..N + 1].
*/

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;



public class Test {
	
	public static void main(String[] args) {
		int[] arr = {3,4,4,6,1,4,4};
		int k =5;

		int[] res = solution(k, arr);
		for(int i:res)
			System.out.print(i + " ");
	}
	
	public static int[] solution(int N, int[] A) {
		int[] res = new int[N];
		Arrays.fill(res, 0);
		int max = 0;
		int newVal = 0; // this is for lazy filling
		for(int i:A) {
			if(i == N+1) {
				//Arrays.fill(res, max);
				newVal = max; // dont fill the array now
			}
			else if(i > 0 && i <= N) {
				// i-1 bcoz counter starts from 1
				//res[i-1]++;
				res[i-1] = Math.max(newVal+1,res[i-1]+1);
				if(res[i-1] > max) {
					max = res[i-1];
				}
			}
			
			
		}
		
		// in the end check if any counter needs to get updated
		for(int i=0;i<res.length;i++) {
			res[i] = Math.max(newVal, res[i]);
		}
		
		return res;
      
    }
	
    }
