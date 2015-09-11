/*Find the minimal average of any slice containing at least two elements.
 * Task description
 * A non-empty zero-indexed array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements). The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
 * For example, array A such that:
 * A[0] = 4
 * A[1] = 2
 * A[2] = 2
 * A[3] = 5
 * A[4] = 1
 * A[5] = 5
 * A[6] = 8
 * contains the following example slices:
 * slice (1, 2), whose average is (2 + 2) / 2 = 2;
 * slice (3, 4), whose average is (5 + 1) / 2 = 3;
 * slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
 * The goal is to find the starting position of a slice whose average is minimal.
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A consisting of N integers, returns the starting position of the slice with the minimal average. If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.
 * For example, given array A such that:
 * A[0] = 4
 * A[1] = 2
 * A[2] = 2
 * A[3] = 5
 * A[4] = 1
 * A[5] = 5
 * A[6] = 8
 * the function should return 1, as explained above.
 * Assume that:
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−10,000..10,000].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;



public class Test {
	
	public static void main(String[] args) {
		int[] arr = {4,2,2,5,1,5,8};
	 int res = solution(arr);
		
			System.out.print(res);
	}
	
	public static int solution(int[] A) {
		
		int minIndex = 0;
		double minValue = Double.MAX_VALUE;
		
		// smallest slice should be of size 2 or 3
		// Slices of bigger sizes are created from such smaller slices
		// If a bigger slice is a minSlice then each sub slice should be also minSlice because avg should be same
		
		for(int i = 0;i<A.length-2;i++) {
			double avg = Math.min(((double)A[i] + (double)A[i+1])/2, ((double)A[i]+(double)A[i+1]+(double)A[i+2])/3);
			if(avg<minValue) {
				minValue =avg;
				minIndex = i;
			}
			
				
			
		}
		double avgOfLastElements = ((double)A[A.length-2] + (double)A[A.length-1] )/2;
		if(avgOfLastElements<minValue) {
			minValue =avgOfLastElements;
			minIndex = A.length-2;
		}
		return minIndex;
		
		}
		
    }
	
    
