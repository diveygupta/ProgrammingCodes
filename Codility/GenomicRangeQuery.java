/*
GenomicRangeQuery
A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?
The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).
For example, consider string S = CAGCCTA and arrays P, Q such that:
    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
The answers to these M = 3 queries are as follows:
The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
Write a function:
class Solution { public int[] solution(String S, int[] P, int[] Q); }
that, given a non-empty zero-indexed string S consisting of N characters and two non-empty zero-indexed arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.
The sequence should be returned as:
a Results structure (in C), or
a vector of integers (in C++), or
a Results record (in Pascal), or
an array of integers (in any other programming language).
For example, given the string S = CAGCCTA and arrays P, Q such that:
    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6
the function should return the values [2, 4, 1], as explained above.
Assume that:
N is an integer within the range [1..100,000];
M is an integer within the range [1..50,000];
each element of arrays P, Q is an integer within the range [0..N − 1];
P[K] ≤ Q[K], where 0 ≤ K < M;
string S consists only of upper-case English letters A, C, G, T.
Complexity:
expected worst-case time complexity is O(N+M);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
*/
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;



public class Test {
	
	public static void main(String[] args) {
		int[] arr = {4,2,2,5,1,5,8};
		String S = "CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
	 int[] res = solution(S, P, Q);
		for(int i:res)
			System.out.print(i + "");
	}
	
	public static int[] solution(String S, int[] P, int[] Q) {
		int[] res = new int[P.length];
	
		// create a matrix of 4*(S.length+1) and store the ocurrences of Letters till that index   // read prefix sum , y[i] = y[i-1] + x[i]; 
		// 4 is used for A,C,G,T
		int[][] mat = new int[4][S.length()+1];
		//Arrays.fill(mat, 0);
		
		for(int i=0;i<S.length();i++) {
			// check what is the char and set it
			int a=0,c=0,g=0,t=0;
			switch(S.charAt(i))
			{
			case 'A':
				a=1;
				break;
			case 'C':
				c=1;
				break;
			case 'G':
				g=1;
				break;
			case 'T':
				t=1;
				break;
	
			}
			
			mat[0][i+1] = mat[0][i] + a;
			mat[1][i+1] = mat[1][i] + c;
			mat[2][i+1] = mat[2][i] + g;
			mat[3][i+1] = mat[3][i] + t;
			
		}
		
		// now for every Pair of P & Q check which of the chars is present in between the indices, the first char found is the least value
		
		for(int j=0;j<P.length;j++) {
			int leftIndex = P[j];
			int rightIndex = Q[j] + 1; //increasing by 1 bcoz value is stored in mat at next index
			
			if((mat[0][rightIndex] - mat[0][leftIndex])>0) {
				res[j]= 1;
			} else if((mat[1][rightIndex] - mat[1][leftIndex])>0) {
				res[j]= 2;
			} else if((mat[2][rightIndex] - mat[2][leftIndex])>0) {
				res[j]= 3;
			} else if((mat[3][rightIndex] - mat[3][leftIndex])>0) {
				res[j]= 4;
			}
		}
		
		return res;
		}
		
    }
	
    
