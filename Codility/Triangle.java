/*
 * A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.
Write a function:
class Solution { public int solution(int[] A); }
that, given a zero-indexed array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.
For example, given array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
the function should return 1, as explained above. Given array A such that:
  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1
the function should return 0.
 */
 
 import java.util.Arrays;


 public class Test {
 	
 	public static void main(String[] args) {
 		int[] arr = {3,1,2,1,3};
 	
 	 int res = solution(arr);
 		//for(int i:res)
 			System.out.print(res);
 	}
 	
 	public static int solution(int[] A) {
 		
 		int res = 0;
 		if(A.length<3){
 			return res;
 		}
 		
 		Arrays.sort(A);
 		// after sorting A[p] + A[r] > A[q] and A[q] + A[r] > A[p] bcoz p<q<r , we olny need to check if A[p] + A[q] > A[r]
 		// we only need to check adjacent p&q 
 		for(int i=0;i<A.length-2;i++) {
 			if((long)(A[i]+A[i+1])>(long)A[i+2]) {
 				res = 1;
 			}
 		}
 		return res;
     }
 		
     }
 	
     
