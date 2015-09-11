/*
Write a function:
class Solution { public int solution(int[] A); }
that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer that does not occur in A.
For example, given:
  A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2
the function should return 5.
Assume that:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].*/

import java.util.BitSet;
import java.util.HashSet;



public class Test {
	
	public static void main(String[] args) {
		int[] arr = {-3,-2,-5,-1};

		System.out.println(solution(arr));
	}
    public static int solution(int[] A) {
       HashSet<Integer> list = new HashSet<Integer>();
       int max = A[0];
       for(int i:A) {
    	   if(i>max) {
    		   max = i;
    	   }
    	   
    	   list.add(i);
       }
       
       for(int i = 1;i<max;i++) {
    	   if(!list.contains(i)) {
    		   return i;
    	   }
       }
       
       if(max<0) {
    	   // return only +ve
    	   return 1;
       } else {
       return max+1;
    }
    }
}