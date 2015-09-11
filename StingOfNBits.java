// given n generate all string of n bits

import java.util.ArrayList;

public class Test {
	
  public static void main(String[] args) {
	   int n = 3;
	   int[] arr = new int[n];
       
        binary(arr, n);
  }
private static void binary(int[] arr, int n) {
	if(n<1) {
		for(int i:arr)
			System.out.print(arr[i]);
		System.out.println();
	}
	else {
	arr[n-1] = 0;
	binary(arr, n-1);
	arr[n-1] = 1;
	binary(arr, n-1);
}
}

}