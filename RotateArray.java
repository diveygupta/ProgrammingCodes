// Rotate an array of n elements to the right by k steps.
// For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
// Soln
// Divide the array into 2 sub arrays [1,2,3,4] and [5,6,7]
// Rotate both arrays [4,3,2,1,7,6,5]
// Rotate whole array [5,6,7,1,2,3,4]

public class Test1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotateArray(arr, 0, arr.length-k);
		rotateArray(arr, arr.length-k, arr.length);
		rotateArray(arr, 0, arr.length);
		for(int i : arr) {
			System.out.print(i + "\t");
		}
	}

	private static void rotateArray(int[] arr, int low, int high) {
		int length = (high - low)/2;
		for(int i = 0; i < length; i++) {
			int temp = arr[low + i];
			arr[low + i] = arr[high - i -1];
			arr[high - i - 1] = temp;
		}
		
	}
}
