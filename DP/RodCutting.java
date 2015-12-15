/*

 * Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. 

 * Determine the maximum value obtainable by cutting up the rod and selling the pieces. 

 * For example, if length of the rod is 8 and the values of different pieces are given as following, 

 * then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)



length   | 1   2   3   4   5   6   7   8  

--------------------------------------------

price    | 1   5   8   9  10  17  17  20


cut(n) = max{price(i)+cut(n-i-1)} for i = 0 to n-1


*/


package practice;


public class RodCutting {


// recursive

public static int cutRod_R(int[] arr, int n) {

if (0 == n)

{

return 0;

}

int maxValue = 0;

for(int i = 0; i < n; i++) {

maxValue = Math.max(maxValue, arr[i] + cutRod_R(arr, n-i-1));

}

return maxValue;	

}

// iterative

public static int cutRod_I(int[] arr, int n) {

int[] values = new int[n+1];

values[0] = 0;

for (int i = 1; i < n+1; i++) {

int maxValue = 0;

for (int j = 0; j < i; j++) {

maxValue = Math.max(maxValue, arr[j] + values[i-j-1]); 

}

values[i] = maxValue;

}

return values[n];	

}

public static void main(String[] args) {

int[] arr = {1,5,8,9,10,17,17,20};

int maxValue_R = cutRod_R(arr, 8);

System.out.println(maxValue_R);

int maxValue_I = cutRod_I(arr, 8);

System.out.println(maxValue_I);

}

}